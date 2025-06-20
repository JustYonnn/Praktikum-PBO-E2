/**
 * Nama File : Anjing.java
 * Deskripsi : kelas untuk hewan peliharaan jenis anjing
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public class Anjing extends Anabul {
    
    // Konstruktor
    public Anjing(String nama) {
        super(nama);
    }
    
    // Implementasi metode bersuara
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: guk-guk");
    }
    
    // Implementasi metode bergerak
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}