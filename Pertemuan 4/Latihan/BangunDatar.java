/* Nama File   : BangunDatar.java
 * Deskripsi   : program kelas bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 13 Maret 2025
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String Warna;
    protected String Border;
    public static int counterBangunDatar;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.Warna = warna;
        this.Border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return Warna;
    }

    public void setWarna(String warna){
        this.Warna = warna;
    }

    public String getBorder(){
        return Border;
    }

    public void setBorder(String border){
        this.Border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + Warna);
        System.out.println("Border: " + Border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}