import java.util.Collections;
import java.util.List;

public class Koleksi {
    private String judul;
    private String penulis;
    private String tahunTerbit;
    private String kategori;
    public List<Buku> buku = Collections.emptyList();
    public List<JurnalIlmiah> jurnalIlmiah = Collections.emptyList();
    public List<Majalah> majalah = Collections.emptyList();

    public Koleksi(String judul, String penulis, String tahunTerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public Koleksi() {

    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getTahunTerbit() {
        return this.tahunTerbit;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void addBuku(Buku buku) {
        this.buku.add(buku);
    }

    public void addJurnal(JurnalIlmiah jurnalIlmiah) {
        this.jurnalIlmiah.add(jurnalIlmiah);
    }

    public void addMajalah(Majalah majalah) {
        this.majalah.add(majalah);
    }

    public void printInfo() {
        if (!buku.isEmpty()) {
            System.out.println("Koleksi Buku    :");
            for (Buku b : buku) {
                System.out.println(" - " + b.getJudul());
            }
        }
        if (!jurnalIlmiah.isEmpty()) {
            System.out.println("Koleksi Jurnal Ilmiah   :");
            for (JurnalIlmiah j : jurnalIlmiah) {
                System.out.println(" - " + j.getJudul());
            }
        }
        if (!majalah.isEmpty()) {
            System.out.println("Koleksi Majalah :");
            for (Majalah m : majalah) {
                System.out.println(" - " + m.getJudul());
            }
        }
    }
}