/* Nama File   : MBangunDatar.java
 * Deskripsi   : Main program kelas bangun datar
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 13 Maret 2025
 */

public class MBangunDatar{
    public static void main(String[] args) {
        // Membuat objek bangun datar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Merah");
        bd.setBorder("Hitam");

        // Membuat objek persegi
        Persegi p = new Persegi(5, "Hijau", "Kuning");

        System.out.println("Info Bangun Datar: ");
        bd.printInfo();

        System.out.println("");

        System.out.println("Jumlah Sisi Persegi: " + p.getJmlSisi());
        System.out.println("Warna Persegi: " + p.getWarna());
        System.out.println("Border Persegi: " + p.getBorder());
        System.out.println("Ukuran Sisi Persegi: " + p.getSisi());

        System.out.println("");

        p.printInfo();

        // Membuat objek lingkaran
        Lingkaran l = new Lingkaran(8, "Biru", "Putih");

        System.out.println("");

        System.out.println("Jumlah Sisi lingkaran: " + l.getJmlSisi());
        System.out.println("Warna Lingkaran: " + l.getWarna());
        System.out.println("Border Lingkaran: " + l.getBorder());
        System.out.println("Jari jari Lingkaran: " + l.getJari());

        System.out.println("");

        l.printInfo();

        bd.printCounterBangunDatar();

    }
}