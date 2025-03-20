/* Nama File   : DosenTetap.java
 * Deskripsi   : program kelas dosen tetap sebagai turunan dari dosen
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return this.NIDN;
    }

    public void setNIDN(String nidn){
        this.NIDN = nidn;
    }

    public double hitungTunjangan() {
        return 0.02 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate hitungBUP() {
        LocalDate bupDate = parseTanggal(getTanggalLahir()).plusYears(65);
        return bupDate.plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIDN: " + NIDN);
        super.printInfo();
        System.out.println("Tunjangan: 2% x " + getMasaKerjaTahun() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}
