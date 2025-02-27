import java.util.ArrayList;

/* Nama File   : Mahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class mahasiswa
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 27 Februari 2025
 */

public class Mahasiswa{
    /* Atribut */
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MatKul> listMatKul;
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    /* Method */
    /* Konstruktor */
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor objek mahasiswa
    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(ArrayList<MatKul> listMatKul) {
        this.listMatKul = listMatKul;
    }

    /* Selektor */
    // Selektor NIM
    public String getNIM(){
        return this.NIM;
    }

    // Selektor Nama
    public String getNama(){
        return this.Nama;
    }

    // Selektor Prodi
    public String getProdi(){
        return this.Prodi;
    }

    // Selektor Dosen Wali
    public Dosen getDosenWali(){
        return this.DosenWali;
    }

    //Selektor Kendaraan
    public Kendaraan getKendaraan(){
        return this.Kendaraan;
    }

    /* Mutator */
    // Mutator NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Mutator Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    // Mutator Dosen Wali
    public void setDosenWali(Dosen DosWal){
        this.DosenWali = DosWal;
    }

    // Mutator Kendaraan
    public void setKendaraan(Kendaraan kendaraan){
        this.Kendaraan = kendaraan;
    }

    // Prosedur menambahkan mata kuliah
    public void addMatkul(MatKul MataKuliah){
        if (this.listMatKul.size() < 50) {
            this.listMatKul.add(MataKuliah);
        } else {
            System.out.println("List Mata Kuliah Sudah Penuh");
        }
    }

    // Fungsi menjumlahkan sks
    public int getJumlahSKS(){
        int jumlah = 0;
        for (MatKul matkul : this.listMatKul) {
            jumlah += matkul.getSKS();
        }
        return jumlah;
    }

    // Fungsi menjumlahkan mata kuliah
    public int getJumlahMatkul(){
        return this.listMatKul.size();
    }

    // Prosedur menampilkan nilai masing masing atribut mahasiswa
    public void printMhs(){
        System.out.println("NIM \t\t" + NIM);
        System.out.println("Nama \t\t" + Nama);
        System.out.println("Prodi \t\t" + Prodi);
    }

    // Prosedur menampilkan nilai dari setiap atribut mahasiswa termasuk hasil relasi
    public void printDetailMhs(){
        printMhs();
        System.out.println("Daftar Mata Kuliah : ");
        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen Wali \t" + DosenWali.getNama());
        System.out.println("Kendaraan \t" + Kendaraan.getJenis());
    }
    
    // Mutator Matkul (biar ga kuning ka hehe)
    public void setListMatKul(ArrayList<MatKul> listMatKul) {
        this.listMatKul = listMatKul;
    }
}