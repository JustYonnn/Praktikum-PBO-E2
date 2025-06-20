/**
 * Nama File : ContohMetodeGenerik.java
 * Deskripsi : kelas untuk metode generik yang memanipulasi kelas Datum
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */

 public class ContohMetodeGenerik {
    
    // Metode generik untuk menampilkan isi Datum
    public <T> void tampilkanIsi(Datum<T> datum) {
        System.out.println("Isi datum: " + datum.getIsi());
    }
    
    // Metode generik untuk mengubah isi Datum
    public <T> void ubahIsi(Datum<T> datum, T isiBaru) {
        datum.setIsi(isiBaru);
        System.out.println("Isi datum telah diubah menjadi: " + datum.getIsi());
    }
    
    // Metode generik khusus untuk Datum berisi Anabul
    public void simulasiAnabul(Datum<? extends Anabul> datum) {
        Anabul anabul = datum.getIsi();
        System.out.println("Simulasi untuk " + anabul.getNama() + ":");
        anabul.bersuara();
        anabul.bergerak();
        System.out.println();
    }
}