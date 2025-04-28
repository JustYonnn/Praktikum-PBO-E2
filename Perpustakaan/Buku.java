public class Buku extends Koleksi{
    private String ISBN;
    private int jumlahHalaman;
    private String penerbit;
    private static int counterBuku = 0;

    @SuppressWarnings("static-access")
    public Buku(String judul, String penulis, String tahunTerbit, String isbn, int jumlahHalaman, String penerbit) {
        super(judul, penulis, tahunTerbit, "Buku");
        this.ISBN = isbn;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
        this.counterBuku++;
    }

    public Buku() {

    }

    public String getISBN() {
        return this.ISBN;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    @SuppressWarnings("static-access")
    public int getCounterBuku() {
        return this.counterBuku;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @Override
    public void printInfo() {
        System.out.println("Judul           : " + getJudul());
        System.out.println("Penulis         : " + getPenulis());
        System.out.println("Tahun Terbit    : " + getTahunTerbit());
        System.out.println("Kategori        : " + getKategori());
        System.out.println("ISBN            : " + getISBN());
        System.out.println("Jumlah Halaman  : " + getJumlahHalaman());
        System.out.println("Penerbit        : " + getPenerbit());
        System.out.println("Harga           : " + (50000 + (getJumlahHalaman() * 500)));
        System.out.println("Diskon Premium  : " + (0.1 * (50000 + (getJumlahHalaman() * 500))));
        System.out.println("Diskon VIP      : " + (0.25 * (50000 + (getJumlahHalaman() * 500))));
    }

    public void printJumlahBuku() {
        System.out.println("Jumlah buku     : " + getCounterBuku());
    }
}