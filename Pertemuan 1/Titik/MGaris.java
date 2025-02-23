/* Nama File   : MGaris.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 22 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        G1.setAwal(new Titik(3,1));
        G1.setAkhir(new Titik(5,4));
        System.out.println("Titik awal garis G1 : (" + G1.getAwal().absis + "," + G1.getAwal().ordinat + ")");
        System.out.println("Titik akhir garis G1 : (" + G1.getAkhir().absis + "," + G1.getAkhir().ordinat + ")");
        G1.printGaris();
        System.out.println("Jumlah garis : " + Garis.getCounterGaris());
        Garis G2 = G1;
        G2.printGaris();
        G2.setAwal(new Titik(10,10));
        G2.setAkhir(new Titik(20,20));
        G2.printGaris();
        System.out.println("Panjang garis G1 : " + G1.Panjang());
        System.out.println("Gradien garis G1 : " + (G1.Gradien()));
        G1.titikTengah().printTitik();
        System.out.println("Garis G1 dan G2 adalah " + G1.isSejajar(G2));
        System.out.println("Garis G1 dan G2 adalah " + G1.isTegakLurus(G2));
        G1.getPersamaanGaris();
    }
}