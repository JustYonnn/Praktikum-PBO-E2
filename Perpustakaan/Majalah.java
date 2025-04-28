public class Majalah extends Koleksi{
    private int nomorEdisi;
    private int  frekuensiTerbit;
    private static int counterMajalah = 0;

    @SuppressWarnings("static-access")
    public Majalah(String judul, String penulis, String tahunTerbit, int nomorEdisi, int frekuensiTerbit) {
        super(judul, penulis, tahunTerbit, "Majalah");
        this.nomorEdisi = nomorEdisi;
        this.frekuensiTerbit = frekuensiTerbit;
        this.counterMajalah++;
    }

    public Majalah() {

    }

    public int getNomorEdisi() {
        return this.nomorEdisi;
    }

    public int getFrekuensiTerbit() {
        return this.frekuensiTerbit;
    }

    @SuppressWarnings("static-access")
    public int getCounterMajalah() {
        return this.counterMajalah;
    }

    public void setNomorEdisi(int nomorEdisi) {
        this.nomorEdisi = nomorEdisi;
    }

    public void setFrekuensiTerbit(int frekuensiTerbit) {
        this.frekuensiTerbit = frekuensiTerbit;
    }

    @Override
    public void printInfo() {
        System.out.println("Judul           : " + getJudul());
        System.out.println("Penulis         : " + getPenulis());
        System.out.println("Tahun Terbit    : " + getTahunTerbit());
        System.out.println("Kategori        : " + getKategori());
        System.out.println("Nomor Edisi     : " + getNomorEdisi());
        System.out.println("Frekuensi Terbit: " + getFrekuensiTerbit());
        System.out.println("Harga Normal    : " + (30000 + (getNomorEdisi() * 1000)));
        System.out.println("Diskon Premium  : " + (0.1 * (30000 + (getNomorEdisi() * 1000))));
        System.out.println("Diskon VIP      : " + (0.25 * (30000 + (getNomorEdisi() * 1000))));
    }

    public void printJumlahMajalah() {
        System.out.println("Jumlah majalah  : " + getCounterMajalah());
    }
}