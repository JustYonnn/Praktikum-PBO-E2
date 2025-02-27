/* Nama File   : MTitik.java
 * Deskripsi   : berisi atribut dan method dalam class titik
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("Absis titik T1 : " + T1.getAbsis());
        System.out.println("Ordinat titik T2 : " + T1.getOrdinat());
        T1.geser(3,4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.printTitik();
        Titik T3 = new Titik();
        Titik T4 = new Titik(3,4);
        T3.printTitik();
        T4.printTitik();
        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        T4.printCounterTitik();
        System.out.println("Titik T4 berada pada kuadran : " + T4.getKuadran());
        System.out.println("Jarak titik T4 terhadap titik pusat adalah : " + T4.getJarakPusat());
        System.out.println("Jarak titik T1 terhadap titik T4 adalah : " + T1.getJarakTitik(T4));
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        Titik T5 = T1.getRefleksiX();
        Titik T6 = T1.getRefleksiY();
        T5.printTitik();
        T6.printTitik();
    }
}