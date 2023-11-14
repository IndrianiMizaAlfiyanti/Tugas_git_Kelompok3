 class Bunga extends Tumbuhan {
    private String warna;

    public Bunga(String nama, String habitat, String warna) {
        super(nama, habitat);
        this.warna = warna;
    }
    
    public void describePlant() {
        System.out.println("Bunga: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Warna: " + this.warna);
    }

    public String getWarna() {
        return warna;
    }
    
    public void lakukanFotosintesis() {
        System.out.println("Bunga sedang melakukan fotosintesis...");
        // Implementasi khusus fotosintesis untuk bunga, jika diperlukan
    }

    public void lakukanRespirasi() {
        System.out.println("Bunga sedang melakukan respirasi...");
        // Implementasi khusus respirasi untuk bunga, jika diperlukan
    }

    public void reproduksi() {
        System.out.println("Bunga sedang mereproduksi...");
        // Implementasi khusus untuk proses reproduksi bunga
    }
}
