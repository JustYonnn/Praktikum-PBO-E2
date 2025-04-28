import java.time.LocalDate;

class KartuKredit extends Pembayaran {
    private String nomorKartu;
    private String cvv;
    private String namaPemegang;

    public KartuKredit(LocalDate tanggalPembayaran, double totalPembayaran, String status, String nomorKartu, String cvv, String namaPemegang) {
        super(tanggalPembayaran, totalPembayaran, status);
        this.nomorKartu = nomorKartu;
        this.cvv = cvv;
        this.namaPemegang = namaPemegang;
    }

    public String getNomorKartu(){
        return this.nomorKartu;
    }

    public String getCVV(){
        return this.cvv;
    }

    public String getNamaPemegang(){
        return this.namaPemegang;
    }

    public void setNomorKartu(String nomorKartu){
        this.nomorKartu = nomorKartu;
    }

    public void setCVV(String cvv){
        this.cvv = cvv;
    }

    public void setNamaPemegang(String namaPemegang){
        this.namaPemegang = namaPemegang;
    }
}