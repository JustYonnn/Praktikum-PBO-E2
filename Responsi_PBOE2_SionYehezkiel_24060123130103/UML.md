``` mermaid
classDiagram
    class Ruang {
        - String kode
        - double panjang
        - double lebar
        - double tinggi
        - int kapasitas
        + getKode()
        + getPanjang()
        + getLebar()
        + getTinggi()
        + getKapasitas()
        + setKode()
        + setPanjang()
        + setLebar()
        + setTinggi()
        + setKapasitas()
        + hitungLuas()
        + hitungBiayaKebersihan(double)
        + printInfo()
    }

    class RuangDepartemen {
        - int kursi
        - int meja
        - int lemari
        - double tarifKebersihan
        + getKursi()
        + getMeja()
        + getLemari()
        + getTarifKebersihan()
        + setKursi()
        + setMeja()
        + setLemari()
        + setTarifKebersihan()
        + hitungBiayaKebersihan()
        + printInfo()
    }

    class RuangDosen {
        - int kursi
        - int meja
        - String dosen
        + getKursi()
        + getMeja()
        + getDosen()
        + setKursi()
        + setMeja()
        + setDosen()
        + printInfo()
    }

    class RuangKelas {
        - int jumlahKursiTersedia
        - int jumlahKursiRusak
        + getJumlahKursiTersedia()
        + getJumlahKursiRusak()
        + setJumlahKursiTersedia()
        + setJumlahKursiRusak()
        + printInfo()
    }

    class RuangLaboratorium {
        - String namaLab
        - double hargaSewa
        + getNamaLab()
        + getHargaSewa()
        + setNamaLab()
        + setHargaSewa()
        + printInfo()
    }

    class LabKomputer {
        - int jumlahKomputer
        + getJumlahKomputer()
        + setJumlahKomputer()
        + printInfo()
    }

    class LabNonKomputer {
        - String mataKuliah
        + getMataKuliah()
        + setMataKuliah()
        + printInfo()
    }

    class Departemen {
        - String nama
        - List~RuangDepartemen~ daftarRuangDepartemen
        - List~RuangDosen~ daftarRuangDosen
        + getNama()
        + getRuangDepartemen()
        + getRuangDosen()
        + setNama()
        + addRuangDepartemen()
        + addRuangDosen()
        + jumlahRuangDepartemen()
        + jumlahRuangDosen()
        + tampilkanRuangDepartemen()
        + tampilkanRuangDosen()
        + printInfo()
    }

    class Fakultas {
        - String nama
        - List~RuangKelas~ daftarRuangKelas
        - List~RuangLaboratorium~ daftarRuangLaboratorium
        + getNama()
        + getRuangKelas()
        + getRuangLaboratorium()
        + setNama()
        + addRuangKelas()
        + addRuangLaboratorium()
        + jumlahRuangKelas()
        + jumlahRuangLaboratorium()
        + tampilkanRuangKelas()
        + tampilkanRuangLaboratorium()
        + printInfo()
    }

    RuangDepartemen --|> Ruang
    RuangDosen --|> Ruang
    RuangKelas --|> Ruang
    RuangLaboratorium --|> Ruang
    LabKomputer --|> RuangLaboratorium
    LabNonKomputer --|> RuangLaboratorium

```