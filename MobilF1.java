public abstract class MobilF1 {
    public static final String LIGA = "FORMULA ONE";
    private final String idMobil;
    private String namaTim;
    private int kecepatan;

    public MobilF1(String idMobil, String namaTim) {
        this(idMobil, namaTim, 200);
    }

    public MobilF1(String idMobil, String namaTim, int kecepatan) {
        this.idMobil = idMobil;
        this.namaTim = namaTim;
        this.kecepatan = kecepatan;
    }

    public abstract void servisMesin();

    public void infoMobil() {
        System.out.println("ID Mobil  : " + idMobil);
        System.out.println("Tim       : " + namaTim);
        System.out.println("Kecepatan : " + kecepatan + " km/h");
    }

    public String getIdMobil() { return idMobil; }
    public String getNamaTim() { return namaTim; }
    public void setNamaTim(String namaTim) { this.namaTim = namaTim; }
    public int getKecepatan() { return kecepatan; }
    public void setKecepatan(int kecepatan) { this.kecepatan = kecepatan; }
}