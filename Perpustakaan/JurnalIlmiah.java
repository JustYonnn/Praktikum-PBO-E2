public class JurnalIlmiah extends Koleksi{
    private String ISSN;
    private double  volume;
    private String institusi;
    private static int counterJurnal = 0;

    @SuppressWarnings("static-access")
    public JurnalIlmiah(String judul, String penulis, String tahunTerbit, String issn, double volume, String institusi) {
        super(judul, penulis, tahunTerbit, "Jurnal Ilmiah");
        this.ISSN = issn;
        this.volume = volume;
        this.institusi = institusi;
        this.counterJurnal++;
    }

    public JurnalIlmiah() {

    }

    public String getISSN() {
        return this.ISSN;
    }

    public double getVolume() {
        return this.volume;
    }

    public String getInstitusi() {
        return this.institusi;
    }

    @SuppressWarnings("static-access")
    public int getCounterJurnal() {
        return this.counterJurnal;
    }

    public void setISSN(String issn) {
        this.ISSN = issn;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setInstitusi(String institusi) {
        this.institusi = institusi;
    }

    @Override
    public void printInfo() {
        System.out.println("Judul           : " + getJudul());
        System.out.println("Penulis         : " + getPenulis());
        System.out.println("Tahun Terbit    : " + getTahunTerbit());
        System.out.println("Kategori        : " + getKategori());
        System.out.println("ISSN            : " + getISSN());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Institusi       : " + getInstitusi());
        System.out.println("Harga           : " + (75000 + (getVolume() * 2000)));
        System.out.println("Diskon Premium  : " + (0.1 * (75000 + (getVolume() * 2000))));
        System.out.println("Diskon VIP      : " + (0.25 * (75000 + (getVolume() * 2000))));
    }

    public void printJumlahJurnal() {
        System.out.println("Jumlah jurnal   : " + getCounterJurnal());
    }
}