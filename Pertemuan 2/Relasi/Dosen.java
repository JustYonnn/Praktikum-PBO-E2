/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class dosen
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 27 Februari 2025
 */

public class Dosen {
    /* Atribut */
    private String NIP;
    private String Nama;
    private String Prodi;

    /* Method */
    /* Konstruktor */
    public Dosen(){

    }

    //Konstruktor objek dosen
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    /* Selektor */
    // Selektor NIP
    public String getNIP(){
        return this.NIP;
    }

    // Selektor Nama
    public String getNama(){
        return this.Nama;
    }

    // Selektor Prodi
    public String getProdi(){
        return this.Prodi;
    }

    /* Mutator */
    // Mutator NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Mutator Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
}