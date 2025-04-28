class LayananTambahan {
    private String idLayanan;
    private static int counter = 1;
    private String namaLayanan;
    private double harga;
    private int jumlah;

    public LayananTambahan() {
        this.idLayanan = "Srv-" + counter++;
        this.namaLayanan = null;
    }

    public String getIdLayanan(){
        return this.idLayanan;
    }

    public String getNamaLayanan(){
        return this.namaLayanan;
    }

    public double getHarga(){
        return this.harga;
    }

    public int getJumlah(){
        return this.jumlah;
    }

    public void setIdLayanan(String idLayanan){
        this.idLayanan = idLayanan;
    }

    public void setNamaLayanan(String namaLayanan){
        this.namaLayanan = namaLayanan;
    }

    public void setHarga(){
        switch (this.namaLayanan.toLowerCase()) {
            case "room service":
                this.harga = 50000.00;
                break;
            case "spa":
                this.harga = 100000.00;
                break;
            case "fitness center":
                this.harga = 75000.00;
                break;
            default:
                System.out.println("Layanan tidak tersedia!");
        }
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
}