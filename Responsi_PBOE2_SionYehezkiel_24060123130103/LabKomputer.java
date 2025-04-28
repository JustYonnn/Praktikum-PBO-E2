public class LabKomputer extends RuangLaboratorium {
    private int jumlahKomputer;

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }

    public int getJumlahKomputer() {
        return this.jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Laboratorium Komputer");
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Nama Lab: " + this.namaLab);
        System.out.println("Harga Sewa: " + this.hargaSewa);
        System.out.println("Jumlah Komputer: " + this.jumlahKomputer);
    }
}