/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class garis
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 22 Februari 2025
 */

public class Garis {
    /* Atribut */
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;


    /* Method */
    public Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }
    
    public Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Getter
    public Titik getAwal(){
        return awal;
    }

    public Titik getAkhir(){
        return akhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    // Setter
    public void setAwal(Titik awal){
        this.awal = awal;
    }

    public void setAkhir(Titik akhir){
        this.akhir = akhir;
    }

    public void printGaris(){
        System.out.println("Garis ((" + awal.getAbsis() + "," + awal.getOrdinat() + "),(" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    public double Panjang(){
        return Math.sqrt((akhir.getAbsis() - awal.getAbsis()) * (akhir.getAbsis() - awal.getAbsis()) + (akhir.getOrdinat() - awal.getOrdinat()) * (akhir.getOrdinat() - awal.getOrdinat()));
    }

    public double Gradien(){
        if(akhir.getAbsis() - awal.getAbsis() != 0){
            return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
        }else{
            return 999999;
        }
    }

    public Titik titikTengah(){
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }

    public boolean isSejajar(Garis G){
        return this.Gradien() == G.Gradien();
    }

    public boolean isTegakLurus(Garis G){
        return this.Gradien() * G.Gradien() == -1;
    }

    public void getPersamaanGaris(){
        double m = Gradien();
        double c = awal.getOrdinat() - (m * awal.getAbsis());

        if (m == 999999) {
            System.out.println("Persamaan garis: x = " + awal.getAbsis());
        }

        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}