public class RuangDepartemen extends Ruang {
    private int kursi;
    private int meja;
    private int lemari;
    private double tarifKebersihan;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursi, int meja, int lemari, double tarifKebersihan) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursi = kursi;
        this.meja = meja;
        this.lemari = lemari;
        this.tarifKebersihan = tarifKebersihan;
    }

    public int getKursi() {
        return this.kursi;
    }

    public int getMeja() {
        return this.meja;
    }

    public int getLemari() {
        return this.lemari;
    }

    public double getTarifKebersihan() {
        return this.tarifKebersihan;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public void setMeja(int meja) {
        this.meja = meja;
    }

    public void setLemari(int lemari) {
        this.lemari = lemari;
    }

    public void setTarifKebersihan(double tarifKebersihan) {
        this.tarifKebersihan = tarifKebersihan;
    }

    public double hitungBiayaKebersihan() {
        return super.hitungBiayaKebersihan(this.tarifKebersihan);
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Departemen");
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Jumlah Kursi: " + this.kursi);
        System.out.println("Jumlah Meja: " + this.meja);
        System.out.println("Jumlah Lemari: " + this.lemari);
    }

    
}