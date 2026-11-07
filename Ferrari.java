public class Ferrari extends MobilF1 {
    private String pembalap;

    public Ferrari(String idMobil, String namaTim, String pembalap) {
        super(idMobil, namaTim); 
        this.pembalap = pembalap;
    }

    @Override
    public void infoMobil() {
        System.out.println("=== MOBIL F1 FERRARI ===");
        System.out.println("ID Mobil  : " + getIdMobil());
        System.out.println("Tim       : " + getNamaTim());
        System.out.println("Pembalap  : " + pembalap);
        System.out.println("Kecepatan : " + getKecepatan() + " km/h");
    }
}