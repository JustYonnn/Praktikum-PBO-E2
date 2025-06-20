/**
 * Nama File : Kucing.java
 * Deskripsi : kelas untuk hewan peliharaan jenis kucing
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public class Kucing extends Anabul {
    
    // Konstruktor
    public Kucing(String nama) {
        super(nama);
    }
    
    // Implementasi metode bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: meong");
    }
    
    // Implementasi metode bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}