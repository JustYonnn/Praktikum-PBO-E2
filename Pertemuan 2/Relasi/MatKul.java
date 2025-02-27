/* Nama File   : MatKul.java
 * Deskripsi   : berisi atribut dan method dalam class mata kuliah
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 27 Februari 2025
 */

public class MatKul{
    /* Atribut */
    private String ID_MatKul;
    private String Nama;
    private int SKS;

    /* Method */
    /* Konstruktor */
    public MatKul(){

    }

    // Konstruktor objek mata kuliah
    public MatKul(String ID, String Nama, int SKS){
        this.ID_MatKul = ID;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    /* Selektor */
    // Selektor ID
    public String getID(){
        return this.ID_MatKul;
    }

    // Selektor Nama
    public String getNama(){
        return this.Nama;
    }

    // Selektor SKS
    public int getSKS(){
        return this.SKS;
    }

    /* Mutator */
    // Mutator ID
    public void setID(String ID){
        this.ID_MatKul = ID;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Mutator SKS
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
}