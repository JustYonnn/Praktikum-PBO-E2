import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Reservasi {
    private String idReservasi;
    private static int counter = 1;
    private LocalDate tanggalCheckin;
    private LocalDate tanggalCheckout;
    private String status;
    private String idPelanggan;
    private Pelanggan cs;
    private List<Kamar> kamar = Collections.emptyList();
    private Pembayaran p;
    private TransaksiLayanan tl;

    public Reservasi(LocalDate tanggalCheckin, LocalDate tanggalCheckout, String idPelanggan) {
        this.idReservasi = "Res-" + counter++;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.status = "Menunggu Pembayaran";
        this.idPelanggan = idPelanggan;
        this.kamar = new ArrayList<>();
        this.p = null;
        this.tl = null;
    }

    public String getIdReservasi(){
        return this.idReservasi;
    }

    public LocalDate getTanggalChekckin(){
        return this.tanggalCheckin;
    }

    public LocalDate getTanggalChekckout(){
        return this.tanggalCheckout;
    }

    public String getStatus(){
        return this.status;
    }

    public String getIdPelanggan(){
        return this.idPelanggan;
    }

    public Pelanggan getPelanggan(){
        return cs;
    }

    public List<Kamar> getKamar(){
        return this.kamar;
    }

    public Pembayaran getPembayaran(){
        return this.p;
    }

    public TransaksiLayanan getTransaksiLayanan(){
        return this.tl;
    }

    public void setIdReservasi(String idReservasi){
        this.idReservasi = idReservasi;
    }

    public void setTanggalChekckin(LocalDate tanggalCheckin){
        this.tanggalCheckin = tanggalCheckin;
    }

    public void setTanggalChekckout(LocalDate tanggalCheckout){
        this.tanggalCheckout = tanggalCheckout;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setIdPelanggan(String idPelanggan){
        this.idPelanggan = idPelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan){
        this.cs = pelanggan;
    }

    public void addKamar(Kamar kamar){ 
        this.kamar.add(kamar); 
        kamar.setStatus("Dipesan");
    }

    public void setPembayaran(Pembayaran p) {
        this.p = p;
    }

    public void setTransaksiLayanan(TransaksiLayanan tl) {
        this.tl = tl;
    }

    public double hitungTotalKamar() {
        return kamar.stream().mapToDouble(k -> k.getHargaPerMalam()).sum();
    }

    public void konfirmasiPembayaran() {
        if (p.status.equals("Selesai")) {
            this.status = "Dipesan";
        }
    }

    public double hitungTotalLayanan() {   
        return this.getTransaksiLayanan().getLayanan().stream().mapToDouble(l -> l.getHarga() * l.getJumlah()).sum();
    }

    public double hitungTotalBiaya() {
        return hitungTotalKamar() + hitungTotalLayanan();
    }

    public void getDetailTransaksi() {
        System.out.println("Layanan tambahan yang dipesan:");
        for (LayananTambahan l : this.getTransaksiLayanan().getLayanan()) {
            System.out.println(" - " + l.getNamaLayanan() + " (Harga: " + l.getHarga() + ", Jumlah: " + l.getJumlah() + ")");
        }
    }

    public void printInfo() {
        System.out.println("Id Reservasi            : " + idReservasi);
        System.out.println("Tanggal Check-in        : " + tanggalCheckin);
        System.out.println("Tanggal Check-out       : " + tanggalCheckout);
        System.out.println("Status Pemesanan        : " + status);
        System.out.println("Status Pembayaran       : " + p.getStatus());
        if (idPelanggan.equals(cs.getNomorIdentitas()))   {
            System.out.println("Nama Pemesan        : " + cs.getNama());
        }
        System.out.println("Kamar yang dipesan      :");
        for (Kamar k : kamar) {
            System.out.println(" - " + k.getNamaTipe() + " (No: " + k.getNomorKamar() + ")");
        }
        if (!tl.getLayanan().isEmpty()) {
            System.out.println("Layanan tambahan    :");
            for (LayananTambahan l : this.getTransaksiLayanan().getLayanan()) {
                System.out.println(" - " + l.getNamaLayanan() + " (Harga: " + l.getHarga() + ")");
            }
        }
        System.out.println("Total Biaya Kamar       : " + hitungTotalKamar());
        System.out.println("Total Biaya Layanan     : " + hitungTotalLayanan());
        System.out.println("Total Biaya Keseluruhan : " + hitungTotalBiaya());
        getDetailTransaksi();
    }

    public void batalkanReservasi() throws Exception {
        if (status.equals("Dipesan") || status.equals("Check-in")) {
            this.status = "Dibatalkan";
            System.out.println("Reservasi telah dibatalkan.");
        } else {
            throw new Exception("Reservasi tidak dapat dibatalkan karena statusnya: " + this.getStatus());
        }
    }
}