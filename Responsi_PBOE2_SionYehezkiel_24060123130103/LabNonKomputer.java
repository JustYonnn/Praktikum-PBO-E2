public class LabNonKomputer extends RuangLaboratorium {
    private String mataKuliah;

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa, String mataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa);
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Jenis Ruang: Laboratorium " + this.mataKuliah);
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
        System.out.println("Nama Lab: " + this.namaLab);
        System.out.println("Harga Sewa: " + this.hargaSewa);
    }
}