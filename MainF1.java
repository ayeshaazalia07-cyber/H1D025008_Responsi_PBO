public class MainF1 {
    public static void main(String[] args) {
        System.out.println("=== " + MobilF1.LIGA + " ===\n");
        
        System.out.println("--- Skenario 1: Servis Pertama ---");

        Mercedes mercedes = new Mercedes("M-01", "Mercedes AMG", 320, false);
        mercedes.bunyiKlakson();
        mercedes.aktifkanTurbo(true);
        mercedes.servisMesin();
        mercedes.infoMobil();

        System.out.println();
        Ferrari ferrari = new Ferrari("F-02", "Scuderia Ferrari", "Charles Leclerc");
        ferrari.setPembalap("Lewis Hamilton");
        ferrari.servisMesin();
        ferrari.infoMobil();
        
        System.out.println("\n--- Skenario 2: Servis Lanjutan ---");
        mercedes.servisMesin();
        mercedes.infoMobil();
        ferrari.servisMesin();
        ferrari.infoMobil();

        System.out.println("\n--- Polimorfisme Interface ---");
        BisaKlakson k = new Mercedes("M-03", "Mercedes Petronas", 310, false);
        BisaTurbo t = new Mercedes("M-04", "Mercedes Petronas", 310, false);
        k.bunyiKlakson();
        t.aktifkanTurbo(true);
    }
}