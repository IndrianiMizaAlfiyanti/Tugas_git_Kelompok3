class Lumut extends Tumbuhan {
    private double lajuPertumbuhan;

    public Lumut(String nama, String habitat, double lajuPertumbuhan) {
        super(nama, habitat);
        this.lajuPertumbuhan = lajuPertumbuhan;
    }

    public void describePlant() {
        System.out.println("Lumut: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Laju Pertumbuhan: " + this.lajuPertumbuhan + " mm perhari");
    }

    public double getLajuPertumbuhan() {
        return lajuPertumbuhan;
    }
    
    public void lakukanFotosintesis() {
        System.out.println("Lumut sedang melakukan fotosintesis...");
        // Implementasi khusus fotosintesis untuk Lumut, jika diperlukan
    }
    
    public void lakukanRespirasi() {
        System.out.println("Lumut sedang melakukan respirasi...");
        // Implementasi khusus respirasi untuk Lumut, jika diperlukan
    }
    
    public void reproduksi() {
        System.out.println("Lumut sedang mereproduksi...");
        // Implementasi khusus untuk proses reproduksi lumut
    }
}
