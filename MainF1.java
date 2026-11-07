public class MainF1 {
    public static void main(String[] args) {
        System.out.println("Ajang: " + MobilF1.LIGA + "\n");

        Mercedes m = new Mercedes("M-01", "Mercedes AMG", 320, false);
        m.infoMobil();
        m.bunyiKlakson();
        m.aktifkanTurbo(true);
        System.out.println();

        Ferrari f = new Ferrari("F-02", "Scuderia Ferrari", "Lewis Hamilton");
        f.infoMobil();
        System.out.println();

        BisaKlakson k = new Mercedes("M-03", "Mercedes AMG", 310, true);
        k.bunyiKlakson();

        BisaTurbo t = new Mercedes("M-04", "Mercedes Petronas", 330, false);
        t.aktifkanTurbo(true);
    }
}