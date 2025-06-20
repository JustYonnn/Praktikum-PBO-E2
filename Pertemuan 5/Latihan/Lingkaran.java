/* Nama File   : Lingkaran.java
 * Deskripsi   : program kelas lingkaran sebagai turunan dari bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Maret 2025
 */

public class Lingkaran extends BangunDatar implements IResize {
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

    @Override
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling(){
        return Math.PI * 2 * jari;
    }

    @Override
    public void zoomIn(){
        this.jari = this.getJari() * 1.1;
    }

    @Override
    public void zoomOut(){
        this.jari = this.getJari() * 0.9;
    }

    @Override
    public void zoom(int percent){
        this.jari = this.getJari() * percent/100;
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