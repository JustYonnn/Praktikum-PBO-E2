/* Nama File   : Lingkaran.java
 * Deskripsi   : program kelas lingkaran sebagai turunan dari bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 13 Maret 2025
 */

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        jari = diameter / 2;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        // System.out.println("Jumlah Sisi: " + getJmlSisi());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Jari jari Lingkaran: " + getJari());
    }
}