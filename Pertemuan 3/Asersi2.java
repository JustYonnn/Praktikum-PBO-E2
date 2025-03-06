/* Nama File   : Asersi2.java
 * Deskripsi   : program untuk menunjukkan asersi
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 6 Maret 2025
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public  class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0):"jari jari tidak boleh nol!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilinglingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilinglingkaran);
    }
}


// pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// Jelaskan pada lembar laporan praktikum!

// jawaban : penempatan asersi yang tidak efektif dan tidak adanya fungsi validasi didalam 
// konstruktor yang menyebabkan objek tetap dapat dibuat dengan jari jari nol 