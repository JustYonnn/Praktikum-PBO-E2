import java.time.LocalDate;

public class MainHotel{
    public static void main(String[] args) {
        TipeKamar t1 = new TipeKamar("Standard");
        t1.setHargaPerMalam();
        TipeKamar t2 = new TipeKamar("Deluxe");
        t2.setHargaPerMalam();
        TipeKamar t3 = new TipeKamar("Suite");
        t3.setHargaPerMalam();

        Kamar k1 = new Kamar("Standard", "101");
        k1.setHargaPerMalam();
        Kamar k2 = new Kamar("Deluxe", "201");
        k2.setHargaPerMalam();
        Kamar k3 = new Kamar("Suite", "301");
        k3.setHargaPerMalam();

        LayananTambahan s1 = new LayananTambahan();
        s1.setNamaLayanan("Spa");
        s1.setHarga();
        LayananTambahan s2 = new LayananTambahan();
        s2.setNamaLayanan("Fitness Center");
        s2.setHarga();
        LayananTambahan s3 = new LayananTambahan();
        s3.setNamaLayanan("Room Service");
        s3.setHarga();

        Pelanggan c1 = new Pelanggan("Umar", "123456789", "0812345678", "UmarGantenk@abc.com");

        Reservasi r1 = new Reservasi(LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 28), "123456789");
        r1.setPelanggan(c1);
        r1.addKamar(k1);
        r1.addKamar(k2);
        r1.addKamar(k3);
        Pembayaran p1 = new Pembayaran(LocalDate.now(), 2250000.00, "Kartu Kredit");
        r1.setPembayaran(p1);
        r1.konfirmasiPembayaran();
        TransaksiLayanan tl1 = new TransaksiLayanan();
        tl1.tambahLayanan(s1, 3);
        tl1.tambahLayanan(s2, 2);
        tl1.tambahLayanan(s3, 1);
        r1.setTransaksiLayanan(tl1);
        r1.printInfo();
    }
}