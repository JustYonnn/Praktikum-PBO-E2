public class RuangDosen extends Ruang {
    private int kursi;
    private int meja;
    private String dosen;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int kursi, int meja, String dosen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.meja = meja;
        this.kursi = kursi;
        this.dosen = dosen;
    }

    public int getKursi() {
        return this.kursi;
    }

    public int getMeja() {
        return this.meja;
    }

    public String getDosen() {
        return this.dosen;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

    public void setMeja(int meja) {
        this.meja = meja;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Dosen");
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Jumlah Kursi: " + this.kursi);
        System.out.println("Jumlah Meja: " + this.meja);
        System.out.println("Ruangan milik: " + this.dosen);
    }
}