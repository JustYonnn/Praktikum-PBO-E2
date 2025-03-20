/* Nama File   : DosenTamu.java
 * Deskripsi   : program kelas dosen tamu sebagai turunan dari dosen
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String kontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = LocalDate.parse(kontrakBerakhir, DateTimeFormatter.ofPattern("d M yyyy"));
    }

    public String getNIDK(){
        return this.NIDK;
    }

    public LocalDate getKontrakBerakhir(){
        return this.kontrakBerakhir;
    }

    public void setNIDK(String nidk){
        this.NIDK = nidk;
    }

    public void setKontrakBerakhir(LocalDate kontrakBerakhir){
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    public int hitungSisaKontrak() {
        return Period.between(LocalDate.now(), kontrakBerakhir).getMonths();
    }

    @Override
    public void printInfo() {
        System.out.println("NIDK: " + NIDK);
        super.printInfo();
        System.out.println("Tunjangan: 2.5% x " + getMasaKerjaTahun() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas : " + getFakultas());
        System.out.println("Masa Kontrak Berakhir: " + Period.between(LocalDate.now(), kontrakBerakhir).getMonths() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + formatTanggal(kontrakBerakhir));
    }
}
