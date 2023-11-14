 class Kaktus extends Tumbuhan {
    private String jenisDuri;

    public Kaktus(String nama, String habitat, String jenisDuri) {
        super(nama, habitat);
        this.jenisDuri = jenisDuri;
    }

    public void describePlant() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("Jenis Duri: " + this.jenisDuri);
    }

    public String getJenisDuri() {
        return jenisDuri;
    }
    
    public void lakukanFotosintesis() {
        System.out.println("Kaktus sedang melakukan fotosintesis...");
        // Implementasi khusus fotosintesis untuk Kaktus, jika diperlukan
    }

    public void lakukanRespirasi() {
        System.out.println("Kaktus sedang melakukan respirasi...");
        // Implementasi khusus respirasi untuk Kaktus, jika diperlukan
    }
    
    public void reproduksi() {
        System.out.println("Kaktus sedang mereproduksi...");
        // Implementasi khusus untuk proses reproduksi kaktus
    }
}
