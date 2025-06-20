/**
 * Nama File : DatumApp.java
 * Deskripsi : aplikasi untuk mensimulasikan kelas Datum dengan berbagai objek Anabul
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public class DatumApp {
    public static void main(String[] args) {
        // Membuat objek-objek Anabul
        Kucing kucing = new Kucing("Meong");
        Anjing anjing = new Anjing("Doggy");
        Burung burung = new Burung("Tweety");
        
        // Membuat objek Datum untuk masing-masing Anabul
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        
        // Simulasi perilaku Anabul dari objek Datum
        System.out.println("=== Simulasi Anabul dari Objek Datum ===");
        // Mengakses objek Anabul dari Datum dan mensimulasikan perilakunya
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().bergerak();
        System.out.println();
        
        datumAnjing.getIsi().bersuara();
        datumAnjing.getIsi().bergerak();
        System.out.println();
        
        datumBurung.getIsi().bersuara();
        datumBurung.getIsi().bergerak();
        System.out.println();
        
        // Mengubah isi dari objek Datum
        Kucing kucingBaru = new Kucing("Kitto");
        datumKucing.setIsi(kucingBaru);
        System.out.println("Setelah mengubah isi Datum:");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().bergerak();
        System.out.println();
    }
}