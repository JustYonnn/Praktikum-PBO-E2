import java.util.Date;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String email;
    private String keanggotaan;
    private Date kadaluarsa;
    private static int counterAnggota = 0;

    @SuppressWarnings("static-access")
    public Anggota(String idAnggota, String nama, String email, String keanggotaan, Date kadaluarsa) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.email = email;
        this.keanggotaan = keanggotaan;
        this.kadaluarsa = kadaluarsa;
        this.counterAnggota++;
    }

    public Anggota() {

    }

    public String getIdAnggota() {
        return this.idAnggota; 
    }

    public String getNama() {
        return this.nama;
    }

    public String getEmail() {
        return this.email;
    }

    public String getKeanggotaan() {
        return this.keanggotaan;
    }

    public Date getKadaluarsa() {
        return this.kadaluarsa;
    }

    @SuppressWarnings("static-access")
    public int getCounterAnggota() {
        return this.counterAnggota;
    }
    
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKeanggotaan(String keanggotaan) {
        this.keanggotaan = keanggotaan;
    }

    public void setKadaluarsa(Date kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public void printInfo() {
        System.out.println("Id Anggota  : " + getIdAnggota());
        System.out.println("Nama        : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("Keanggotaan : " + getKeanggotaan());
        System.out.println("Kadaluarsa  : " + getKadaluarsa());
        switch (this.getKeanggotaan().toLowerCase()) {
            case "basic" -> {
                System.out.println("Biaya               : Rp100.000/Tahun");
                System.out.println("Unduhan Maksimal    : 5 Bacaan");
            }
            case "premium" -> {
                System.out.println("Biaya   : Rp250.000/Tahun");
                System.out.println("Unduhan Maksimal    : 15 Bacaan");
            }
            case "vip" -> {
                System.out.println("Biaya   : Rp500.000/Tahun");
                System.out.println("Unduhan Maksimal    : Tidak memiliki batas");
            }
            default -> System.out.println("Keanggotaan tidak valid!");
        }
    }    

    public void printJumlahAnggota() {
        System.out.println("Jumlah Anggota  : " + getCounterAnggota());
    }
}