class Pohon extends Tumbuhan {
    private double tinggi;

    public Pohon(String nama, String habitat, double tinggi) {
        super(nama, habitat);
        this.tinggi = tinggi;
    }

    public void describePlant() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Tinggi: " + this.tinggi + " meter");
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public void lakukanFotosintesis() {
        System.out.println("Pohon sedang melakukan fotosintesis...");
        // Implementasi khusus fotosintesis untuk pohon, jika diperlukan
    }

    public void lakukanRespirasi() {
        System.out.println("Pohon sedang melakukan respirasi...");
        // Implementasi khusus respirasi untuk pohon, jika diperlukan
    }
    
    public void reproduksi() {
        System.out.println("Pohon sedang mereproduksi...");
        // Implementasi khusus untuk proses reproduksi Pohon
    }
}
