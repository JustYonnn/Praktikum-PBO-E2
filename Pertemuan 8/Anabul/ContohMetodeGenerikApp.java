/**
 * Nama File : ContohMetodeGenerikApp.java
 * Deskripsi : aplikasi untuk mensimulasikan metode generik pada kelas Datum
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public class ContohMetodeGenerikApp {
    public static void main(String[] args) {
        // Membuat objek-objek Anabul
        Kucing kucing = new Kucing("Meong");
        Anjing anjing = new Anjing("Doggy");
        Burung burung = new Burung("Tweety");
        
        // Membuat objek Datum untuk masing-masing Anabul
        Datum<Kucing> datumKucing = new Datum<>(kucing);
        Datum<Anjing> datumAnjing = new Datum<>(anjing);
        Datum<Burung> datumBurung = new Datum<>(burung);
        
        // Membuat objek ContohMetodeGenerik
        ContohMetodeGenerik cmg = new ContohMetodeGenerik();
        
        // Menggunakan metode generik untuk mensimulasikan perilaku anabul
        System.out.println("=== Simulasi Anabul menggunakan Metode Generik ===");
        cmg.simulasiAnabul(datumKucing);
        cmg.simulasiAnabul(datumAnjing);
        cmg.simulasiAnabul(datumBurung);
        
        // Menampilkan dan mengubah isi Datum
        System.out.println("=== Manipulasi Objek Datum dengan Metode Generik ===");
        cmg.tampilkanIsi(datumKucing);
        
        // Membuat kucing baru
        Kucing kucingBaru = new Kucing("Kitto");
        cmg.ubahIsi(datumKucing, kucingBaru);
        
        // Simulasi ulang dengan isi yang baru
        System.out.println("\n=== Simulasi Ulang dengan Isi Baru ===");
        cmg.simulasiAnabul(datumKucing);
        
        // Demonstrasi penggunaan Datum dengan tipe data lain
        System.out.println("=== Demonstrasi Datum dengan Tipe Data Lain ===");
        Datum<String> datumString = new Datum<>("Ini adalah string");
        Datum<Integer> datumInteger = new Datum<>(123);
        
        cmg.tampilkanIsi(datumString);
        cmg.tampilkanIsi(datumInteger);
        
        cmg.ubahIsi(datumString, "String telah diubah");
        cmg.ubahIsi(datumInteger, 456);
    }
}