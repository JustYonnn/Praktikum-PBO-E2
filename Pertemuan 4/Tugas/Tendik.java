/* Nama File   : Tendik.java
 * Deskripsi   : program kelas tendik sebagai turunan pegawai
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return this.bidang;
    }

    public void setBidang(String Bidang){
        this.bidang = Bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate hitungBUP() {
        LocalDate bupDate = parseTanggal(getTanggalLahir()).plusYears(55);
        return bupDate.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tunjangan: 1% x " + getMasaKerjaTahun() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println("Jabatan: Tenaga Kependidikan (Tendik)");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}