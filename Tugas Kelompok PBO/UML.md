``` mermaid
classDiagram
    class Pelanggan {
        -String idPelanggan
        -static int counter
        -String nama
        -String nomorIdentitas
        -String nomorTelepon
        -String email
        +Pelanggan()
        +Pelanggan(String, String, String, String)
        +getIdPelanggan(): String
        +getNama(): String
        +getNomorIdentitas(): String
        +getNomorTelepon(): String
        +getEmail(): String
        +setIdPelanggan(String)
        +setNama(String)
        +setNomorIdentitas(String)
        +setNomorTelepon(String)
        +setEmail(String)
        +printInfo()
    }

    class Pembayaran {
        #String idPembayaran
        -static int counter
        #LocalDate tanggalPembayaran
        #double totalPembayaran
        #String metodePembayaran
        #String status
        +Pembayaran(LocalDate, double, String)
        +getIdPembayaran(): String
        +getTanggalPembayaran(): LocalDate
        +getTotalPembayaran(): double
        +getMetodePembayaran(): String
        +getStatus(): String
        +setIdPembayaran(String)
        +setTanggalPembayaran(LocalDate)
        +setTotalPembayaran(double)
        +setMetodePembayaran(String)
        +setStatus(String)
    }

    class EWallet {
        -String provider
        -String nomorHp
        +EWallet(LocalDate, double, String, String, String)
        +getProvider(): String
        +getNomorHp(): String
        +setProvider(String)
        +setNomorHp(String)
    }

    class KartuKredit {
        -String nomorKartu
        -String cvv
        -String namaPemegang
        +KartuKredit(LocalDate, double, String, String, String, String)
        +getNomorKartu(): String
        +getCVV(): String
        +getNamaPemegang(): String
        +setNomorKartu(String)
        +setCVV(String)
        +setNamaPemegang(String)
    }

    class TransferBank {
        -String bankName
        -String nomorRekening
        +TransferBank(LocalDate, double, String, String, String)
        +getBankName(): String
        +getNomorRekening(): String
        +setBankName(String)
        +setNomorRekening(String)
    }

    class TipeKamar {
        #String idTipe
        #static int counter
        #String namaTipe
        #double hargaPerMalam
        +TipeKamar(String)
        +getIdTipe(): String
        +getNamaTipe(): String
        +getHargaPerMalam(): double
        +setIdTipe(String)
        +setNamaTipe(String)
        +setHargaPerMalam()
    }

    class Kamar {
        -String nomorKamar
        -String status
        +Kamar(String, String)
        +getNomorKamar(): String
        +getStatus(): String
        +setNomorKamar(String)
        +setStatus(String)
    }

    class LayananTambahan {
        -String idLayanan
        -static int counter
        -String namaLayanan
        -double harga
        -int jumlah
        +LayananTambahan()
        +getIdLayanan(): String
        +getNamaLayanan(): String
        +getHarga(): double
        +getJumlah(): int
        +setIdLayanan(String)
        +setNamaLayanan(String)
        +setHarga()
        +setJumlah(int)
    }

    class TransaksiLayanan {
        -String idTransaksi
        -static int counter
        -List<LayananTambahan> layanan
        -LocalDate tanggalPemesanan
        +TransaksiLayanan()
        +getIdTransaksi(): String
        +getLayanan(): List<LayananTambahan>
        +getTanggalPemesanan(): LocalDate
        +setIdTransaksi(String)
        +tambahLayanan(LayananTambahan, int)
        +setTanggalPemesanan(LocalDate)
    }

    class Reservasi {
        -String idReservasi
        -static int counter
        -LocalDate tanggalCheckin
        -LocalDate tanggalCheckout
        -String status
        -String idPelanggan
        -Pelanggan cs
        -List<Kamar> kamar
        -Pembayaran p
        -TransaksiLayanan tl
        +Reservasi(LocalDate, LocalDate, String)
        +getIdReservasi(): String
        +getTanggalCheckin(): LocalDate
        +getTanggalCheckout(): LocalDate
        +getStatus(): String
        +getIdPelanggan(): String
        +getPelanggan(): Pelanggan
        +getKamar(): List<Kamar>
        +getPembayaran(): Pembayaran
        +getTransaksiLayanan(): TransaksiLayanan
        +setIdReservasi(String)
        +setTanggalCheckin(LocalDate)
        +setTanggalCheckout(LocalDate)
        +setStatus(String)
        +setIdPelanggan(String)
        +setPelanggan(Pelanggan)
        +addKamar(Kamar)
        +setPembayaran(Pembayaran)
        +setTransaksiLayanan(TransaksiLayanan)
        +hitungTotalKamar(): double
        +konfirmasiPembayaran() 
        +hitungTotalLayanan(): double
        +hitungTotalBiaya(): double
        +getDetailTransaksi()
        +printInfo()
    }

    Pelanggan "1..n"o--o"1" Reservasi : Dibuat
    TransaksiLayanan "1"o--o"1..n" LayananTambahan : Diliputi 
    Reservasi "1"o--o"1..n" Kamar : Diliputi
    Reservasi "1"*--*"1" Pembayaran : Dilakukan
    TipeKamar "1"<|--"1..n" Kamar : Dimiliki
    Pembayaran <|-- EWallet : Merupakan
    Pembayaran <|-- KartuKredit : Merupakan
    Pembayaran <|-- TransferBank : Merupakan
    Reservasi "1"<--"0..1" TransaksiLayanan : Dilakukan

```
