import java.time.LocalDate;

class TransferBank extends Pembayaran {
    private String bankName;
    private String nomorRekening;

    public TransferBank(LocalDate tanggalPembayaran, double totalPembayaran, String status, String bankName, String nomorRekening) {
        super(tanggalPembayaran, totalPembayaran, status);
        this.bankName = bankName;
        this.nomorRekening = nomorRekening;
    }

    public String getBankName(){
        return this.bankName;
    }

    public String getNomorRekening(){
        return this.nomorRekening;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public void setNomorRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }
}