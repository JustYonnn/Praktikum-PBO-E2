/* Nama File   : Dosen.java
 * Deskripsi   : program kelas dosen sebagai turunan dari pegawai
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 17 Maret 2025
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    @Override
    protected LocalDate parseTanggal(String tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M yyyy");
        try {
            String cleanedDate = tanggal.trim().replaceAll(" +", " "); 
            System.out.println("Parsing tanggal: " + cleanedDate);
            return LocalDate.parse(cleanedDate, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Format tanggal salah: " + tanggal + " - Gunakan format d M yyyy (contoh: 5 5 1990)");
            return null; 
        }
    }

    @Override
    protected String formatTanggal(LocalDate tanggal) {
        if (tanggal == null) return "Invalid Date";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return tanggal.format(formatter);
    }
}