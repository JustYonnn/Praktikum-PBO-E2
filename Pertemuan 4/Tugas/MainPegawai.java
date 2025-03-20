/* Nama File   : MainPegawai.java
 * Deskripsi   : main program kelas pegawai dan objek turunan lainnya
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */

public class MainPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "78647324", "Andi", "5 5 1990", "1 1 2015", 5000000, "Fakultas Sains dan Matematika");
        DosenTamu dosenTamu = new DosenTamu("9578674534", "78965432", "Budi", "10 10 1985", "1 2 2020", 4000000, "Fakultas Teknik", "1 12 2025");
        Tendik tendik = new Tendik("9786543210", "Siti", "15 8 1980", "1 6 2010", 3000000, "Kemahasiswaan");

        System.out.println("=== Informasi Pegawai ===");
        System.out.println("\n--- Dosen Tetap ---");
        dosenTetap.printInfo();

        System.out.println("\n--- Dosen Tamu ---");
        dosenTamu.printInfo();

        System.out.println("\n--- Tendik ---");
        tendik.printInfo();
    }
}
