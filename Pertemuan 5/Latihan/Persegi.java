/* Nama File   : Persegi.java
 * Deskripsi   : program kelas persegi sebagai turunan dari bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Maret 2025
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
        this.Warna = warna;
        this.Border = border;
        this.jmlSisi = 4;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2 * sisi * sisi);
    }

    @Override
    public void zoomIn(){
        this.sisi = this.getSisi() * 1.1;
    }

    @Override
    public void zoomOut(){
        this.sisi = this.getSisi() * 0.9;
    }

    @Override
    public void zoom(int percent){
        this.sisi = this.getSisi() * percent/100;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        // System.out.println("Jumlah Sisi: " + getJmlSisi());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Panjang Sisi: " + getSisi());
    }

    // @Override
    // public static void counterBangunDatar(){

    // }
}