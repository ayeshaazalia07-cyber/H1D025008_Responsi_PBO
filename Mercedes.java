public class Mercedes extends MobilF1 implements BisaKlakson, BisaTurbo {
    private boolean statusTurbo;

    public Mercedes(String idMobil, String namaTim, int kecepatan, boolean statusTurbo) {
        super(idMobil, namaTim, kecepatan);
        this.statusTurbo = statusTurbo;
    }

    @Override
    public void infoMobil() {
        System.out.println("=== MOBIL F1 MERCEDES ===");
        System.out.println("ID Mobil  : " + getIdMobil());
        System.out.println("Tim       : " + getNamaTim());
        System.out.println("Kecepatan : " + getKecepatan() + " km/h");
        System.out.println("Status Turbo: " + statusTurbo);
    }

    @Override
    public void bunyiKlakson() {
        System.out.println(">> Mercedes: Beep beep!");
    }

    @Override
    public void aktifkanTurbo(boolean status) {
        this.statusTurbo = status;
        if (status) {
            System.out.println(">> Turbo Mercedes MENYALA! Kecepatan meningkat.");
        } else {
            System.out.println(">> Turbo Mercedes MATI.");
        }
    }
}