/**
 * Nama File : Lingkaran.java
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */
public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}
