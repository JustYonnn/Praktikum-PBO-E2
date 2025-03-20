/* Nama File   : Pegawai.java
 * Deskripsi   : program kelas pegawai
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String NIP;
    protected String nama;
    protected String tanggalLahir;
    protected String TMT;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTMT(){
        return TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setNIP(String nip){
        this.NIP = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(String tmt){
        this.TMT = tmt;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public int getMasaKerjaTahun() {
        LocalDate tmtDate = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("d M yyyy"));
        return Period.between(tmtDate, LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        LocalDate tmtDate = LocalDate.parse(TMT, DateTimeFormatter.ofPattern("d M yyyy"));
        return Period.between(tmtDate, LocalDate.now()).getMonths();
    }

    protected LocalDate parseTanggal(String tanggal) {
        return LocalDate.parse(tanggal, DateTimeFormatter.ofPattern("d M yyyy"));
    }

    protected String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(parseTanggal(tanggalLahir)));
        System.out.println("TMT: " + formatTanggal(parseTanggal(TMT)));
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
    }
}