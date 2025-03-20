``` mermaid
classDiagram
    class Pegawai{
    #String NIP
    #String nama
    #String tanggalLahir
    #String TMT
    #double gajiPokok
    +Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok)
    +getNIP()
    +getNama()
    +getTanggalLahir()
    +getTMT()
    +getGajiPokok()
    +setNIP(String nip)
    +setNama(String nama)
    +setTanggalLahir(String tanggalLahir)
    +setTMT(String tmt)
    +setGajiPokok(double gajiPokok)
    +getMasaKerjaTahun()
    +getMasaKerjaBulan()
    #parseTanggal(String tanggal)
    #formatTanggal(LocalDate tanggal)
    +printInfo()
    }

    class Tendik {
        - String bidang
        + Tendik(String, String, String, String, double, String)
        + String getBidang()
        + void setBidang(String)
        + double hitungTunjangan()
        + LocalDate hitungBUP()
        + void printInfo()
    }

    class Dosen {
        - String fakultas
        + Dosen(String, String, String, String, double, String)
        + String getFakultas()
        + void setFakultas(String)
        # LocalDate parseTanggal(String)
        # String formatTanggal(LocalDate)
    }

    class DosenTetap {
        - String NIDN
        + DosenTetap(String, String, String, String, String, double, String)
        + String getNIDN()
        + void setNIDN(String)
        + double hitungTunjangan()
        + LocalDate hitungBUP()
        + void printInfo()
    }

    class DosenTamu {
        - String NIDK
        - LocalDate kontrakBerakhir
        + DosenTamu(String, String, String, String, String, double, String, String)
        + String getNIDK()
        + LocalDate getKontrakBerakhir()
        + void setNIDK(String)
        + void setKontrakBerakhir(LocalDate)
        + double hitungTunjangan()
        + int hitungSisaKontrak()
        + void printInfo()
    }

    Pegawai <|-- Dosen
    Pegawai <|-- Tendik
    Dosen <|-- DosenTetap 
    Dosen <|-- DosenTamu
```