public class Mercedes extends MobilF1 implements BisaKlakson, BisaTurbo {
    private boolean statusTurbo;

    public Mercedes(String idMobil, String namaTim, int kecepatan, boolean statusTurbo) {
        super(idMobil, namaTim, kecepatan);
        this.statusTurbo = statusTurbo;
    }

    public boolean getStatusTurbo() { return statusTurbo; }
    public void setStatusTurbo(boolean statusTurbo) { this.statusTurbo = statusTurbo; }

    @Override
    public void infoMobil() {
        System.out.println("=== MOBIL F1 MERCEDES ===");
        super.infoMobil();
        System.out.println("Turbo     : " + (statusTurbo ? "ON" : "OFF"));
    }

    @Override
    public void servisMesin() {
        int lama = getKecepatan();
        if (lama > 300) {
            setKecepatan(250);
            statusTurbo = false;
            System.out.println(">> Mercedes servis: " + lama + " terlalu tinggi, reset ke 250 & turbo OFF");
        } else {
            setKecepatan(320);
            statusTurbo = true;
            System.out.println(">> Mercedes servis: " + lama + " aman, naik ke 320 & turbo ON");
        }
    }

    @Override
    public void bunyiKlakson() {
        System.out.println(">> Mercedes: Beep beep!");
    }

    @Override
    public void aktifkanTurbo(boolean status) {
        this.statusTurbo = status;
        if (status) {
            setKecepatan(getKecepatan() + 50);
            System.out.println(">> Turbo MENYALA! Kecepatan jadi " + getKecepatan() + " km/h");
        } else {
            System.out.println(">> Turbo MATI.");
        }
    }
}