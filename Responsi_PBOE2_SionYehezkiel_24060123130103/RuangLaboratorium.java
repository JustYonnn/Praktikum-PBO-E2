public class RuangLaboratorium extends Ruang {
    protected  String namaLab;
    protected  double hargaSewa;

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLab() {
        return this.namaLab;
    }

    public double getHargaSewa() {
        return this.hargaSewa;
    }

    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Laboratorium");
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Nama Lab: " + this.namaLab);
        System.out.println("Harga Sewa: " + this.hargaSewa);
    }
}