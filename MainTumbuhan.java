 public class MainTumbuhan {
    public static void main(String[] args) {
        Bunga bungaMatahari = new Bunga("Bunga Matahari", "Taman Bunga", "Kuning");
        Pohon pohonMangga = new Pohon("Pohon Mangga", "hutan", 15.0);
        Paku pakuSarangBurung = new Paku("Paku Sarang Burung", "Hutan", "Monospora");
        Kaktus kaktusBarel = new Kaktus("Kaktus Barel", "Gurun", "Radial");
        Lumut lumutTanduk = new Lumut("Lumut Tanduk", "Tepi Sungai", 0.05);

        System.out.println("=================================");
        System.out.println("\t BUNGA MATAHARI\t");
        System.out.println("=================================");
        bungaMatahari.describePlant();
        bungaMatahari.lakukanFotosintesis();
        bungaMatahari.reproduksi();
        System.out.println("Warna Bunga Matahari: " + bungaMatahari.getWarna());
        System.out.println();

        System.out.println("=================================");
        System.out.println("\t POHON MANGGA\t");
        System.out.println("=================================");
        pohonMangga.describePlant();
        pohonMangga.lakukanFotosintesis();
        pohonMangga.lakukanRespirasi();
        pohonMangga.reproduksi();
        System.out.println("Tinggi Pohon Mangga: " + pohonMangga.getTinggi() + " meter");
        System.out.println();

        System.out.println("====================================");
        System.out.println("\t PAKU SARANG BURUNG\t");
        System.out.println("====================================");
        pakuSarangBurung.describePlant();
        pakuSarangBurung.lakukanFotosintesis();
        pakuSarangBurung.reproduksi();
        System.out.println("Tipe spora Paku Sarang Burung: " + pakuSarangBurung.getTipeSpora());
        System.out.println();

        System.out.println("=================================");
        System.out.println("\t KAKTUS BAREL\t");
        System.out.println("=================================");
        kaktusBarel.describePlant();
        kaktusBarel.lakukanRespirasi();
        kaktusBarel.reproduksi();
        System.out.println("Jenis duri Kaktus Barel: " + kaktusBarel.getJenisDuri());
        System.out.println();

        System.out.println("=================================");
        System.out.println("\t LUMUT TANDUK\t");
        System.out.println("=================================");
        lumutTanduk.describePlant();
        lumutTanduk.lakukanFotosintesis();
        lumutTanduk.lakukanRespirasi();
        lumutTanduk.reproduksi();
        System.out.println("Laju pertumbuhan Lumut Tanduk: " + lumutTanduk.getLajuPertumbuhan() + " mm perhari");
    }
}
