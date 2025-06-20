/* Nama File   : Main.java
 * Deskripsi   : kelas main bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10,"putih","hitam");
        Persegi P2 = new Persegi(5,"putih","hitam");
        BangunDatar L1 = new Lingkaran(7,"putih","hitam");
        Lingkaran L2 = new Lingkaran (14,"putih","hitam");
        P1.getLuas();
        P2.getKeliling();
        L1.getLuas();
        L2.getKeliling();
        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();
        P1.isEqualKeliling(L1);
        P2.isEqualLuas(L2);
        // P1.zoomIn();
        P2.zoomOut();
        // L1.zoom(60);
        L2.zoom(30);
    }
}
