public class RuangKelas extends Ruang {
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    public int getJumlahKursiTersedia() {
        return this.jumlahKursiTersedia;
    }

    public int getJumlahKursiRusak() {
        return this.jumlahKursiRusak;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Kelas");
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Jumlah Kursi Tersedia: " + this.jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + this.jumlahKursiRusak);
    }
}