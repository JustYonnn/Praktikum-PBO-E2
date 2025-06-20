/**
 * Nama File : Anabul.java
 * Deskripsi : kelas abstrak untuk hewan peliharaan
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public abstract class Anabul {
    // Atribut untuk menyimpan nama hewan
    protected String nama;
    
    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // Metode abstrak untuk bunyi hewan
    public abstract void bersuara();
    
    // Metode abstrak untuk gerakan hewan
    public abstract void bergerak();
}