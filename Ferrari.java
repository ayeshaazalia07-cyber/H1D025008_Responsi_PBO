public class Ferrari extends MobilF1 {
    private String pembalap;

    public Ferrari(String idMobil, String namaTim, String pembalap) {
        super(idMobil, namaTim);
        this.pembalap = pembalap;
    }

    public String getPembalap() { return pembalap; }
    public void setPembalap(String pembalap) { this.pembalap = pembalap; }

    @Override
    public void infoMobil() {
        System.out.println("=== MOBIL F1 FERRARI ===");
        super.infoMobil();
        System.out.println("Pembalap  : " + pembalap);
    }

    @Override
    public void servisMesin() {
        int lama = getKecepatan();
        if (lama <= 250) {
            setKecepatan(300);
            System.out.println(">> Ferrari pit stop: " + lama + " (Cruising), digeber ke 300 km/h");
        } else {
            setKecepatan(220);
            System.out.println(">> Ferrari pit stop: " + lama + " (Race Pace), diturunkan ke 220 km/h");
        }
    }
}