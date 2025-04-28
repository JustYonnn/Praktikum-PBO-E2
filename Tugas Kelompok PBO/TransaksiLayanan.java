import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class TransaksiLayanan extends LayananTambahan{
    private String idTransaksi;
    private static int counter = 1;
    private List<LayananTambahan> layanan = new ArrayList<>();
    private LocalDate tanggalPemesanan;

    public TransaksiLayanan() {
        super();
        this.idTransaksi = "Strs-" + counter++;
        this.layanan = new ArrayList<>();
    }

    public String getIdTransaksi(){
        return this.idTransaksi;
    }

    public List<LayananTambahan> getLayanan(){
        return this.layanan;
    }

    public LocalDate getTanggalPemesanan(){
        return this.tanggalPemesanan;
    }

    public void setIdTransaksi(String idTransaksi){
        this.idTransaksi = idTransaksi;
    }

    public void tambahLayanan(LayananTambahan layananTambahan, int jumlah) {
        layananTambahan.setJumlah(jumlah);  
        layanan.add(layananTambahan);   
    }


    public void setTanggalPemesanan(LocalDate tanggalPemesanan){
        this.tanggalPemesanan = tanggalPemesanan;
    }
}
