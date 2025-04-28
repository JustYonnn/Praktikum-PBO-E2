import java.time.LocalDate;

class EWallet extends Pembayaran {
    private String provider;
    private String nomorHp;

    public EWallet(LocalDate tanggalPembayaran, double totalPembayaran, String status, String provider, String nomorHp) {
        super(tanggalPembayaran, totalPembayaran, status);
        this.provider = provider;
        this.nomorHp = nomorHp;
    }

    public String getProvider(){
        return this.provider;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public void setProvider(String provider){
        this.provider = provider;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }
}