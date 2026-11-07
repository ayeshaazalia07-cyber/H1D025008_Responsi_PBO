public abstract class MobilF1 {
    public static final String LIGA = "FORMULA ONE";
    private final String idMobil;
    
    private String namaTim;
    private int kecepatan;

    public MobilF1(String idMobil, String namaTim) {
        this.idMobil = idMobil;
        this.namaTim = namaTim;
        this.kecepatan = 200;
    }

    public MobilF1(String idMobil, String namaTim, int kecepatan) {
        this.idMobil = idMobil;
        this.namaTim = namaTim;
        this.kecepatan = kecepatan;
    }

    public abstract void infoMobil();

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public String getNamaTim() {
        return this.namaTim;
    }

    public String getIdMobil() {
        return this.idMobil;
    }
}