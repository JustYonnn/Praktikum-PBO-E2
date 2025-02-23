/* Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class garis
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 22 Februari 2025
 */

public class Garis {
    /* Atribut */
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;


    /* Method */
    Garis(){
        this(new Titik(0, 0), new Titik(1, 1));
    }
    
    Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // Getter
    Titik getAwal(){
        return awal;
    }

    Titik getAkhir(){
        return akhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    // Setter
    void setAwal(Titik awal){
        this.awal.absis = awal.absis;
        this.awal.ordinat = awal.ordinat;
    }

    void setAkhir(Titik akhir){
        this.akhir.absis = akhir.absis;
        this.akhir.ordinat = akhir.ordinat;
    }

    void printGaris(){
        System.out.println("Garis ((" + awal.absis + "," + awal.ordinat + "),(" + akhir.absis + "," + akhir.ordinat + ")");
    }

    double Panjang(){
        return Math.sqrt((akhir.getAbsis() - awal.getAbsis()) * (akhir.getAbsis() - awal.getAbsis()) + (akhir.getOrdinat() - awal.getOrdinat()) * (akhir.getOrdinat() - awal.getOrdinat()));
    }

    double Gradien(){
        if(akhir.getAbsis() - awal.getAbsis() != 0){
            return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
        }else{
            return 999999;
        }
    }

    Titik titikTengah(){
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }

    boolean isSejajar(Garis G){
        return this.Gradien() == G.Gradien();
    }

    boolean isTegakLurus(Garis G){
        return this.Gradien() * G.Gradien() == -1;
    }

    void getPersamaanGaris(){
        double m = Gradien();
        double c = awal.getOrdinat() - (m * awal.getAbsis());

        if (m == 999999) {
            System.out.println("Persamaan garis: x = " + awal.getAbsis());
        }

        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}