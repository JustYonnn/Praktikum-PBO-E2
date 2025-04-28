import java.time.LocalDate;

class Pembayaran {
    protected String idPembayaran;
    private static int counter = 1;
    protected LocalDate tanggalPembayaran;
    protected double totalPembayaran;
    protected String metodePembayaran;
    protected String status;

    public Pembayaran(LocalDate tanggalPembayaran, double totalPembayaran, String metodePembayaran) {
        this.idPembayaran = "Trs-" + counter++;
        this.tanggalPembayaran = tanggalPembayaran;
        this.totalPembayaran = totalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.status = "Selesai";
    }

    public String getIdPembayaran(){
        return this.idPembayaran;
    }

    public LocalDate getTanggalPembayaran(){
        return this.tanggalPembayaran;
    }

    public double getTotalPembayaran(){
        return this.totalPembayaran;
    }

    public String getMetodePembayaran(){
        return this.metodePembayaran;
    }

    public String getStatus(){
        return this.status;
    }

    public void setIdPembayaran(String idPembayaran){
        this.idPembayaran = idPembayaran;
    }

    public void setTanggalPembayaran(LocalDate tanggalPembayaran){
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran){
        this.totalPembayaran = totalPembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran){
        this.metodePembayaran = metodePembayaran;
    }

    public void setStatus(String status){
        this.status = status;
    }
}