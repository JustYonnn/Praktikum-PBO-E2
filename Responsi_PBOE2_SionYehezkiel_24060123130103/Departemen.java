import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departemen {
    private String nama;
    private List<RuangDepartemen> daftarRuangDepartemen = Collections.emptyList();
    private List<RuangDosen> daftarRuangDosen = Collections.emptyList();
    
    public Departemen(String nama) {
        this.nama = nama;
        this.daftarRuangDepartemen = new ArrayList<>();
        this.daftarRuangDosen = new ArrayList<>();
    }

    public String getNama() {
        return this.nama;
    }

    public List<RuangDepartemen> getRuangDepartemen() {
        return this.daftarRuangDepartemen;
    }

    public List<RuangDosen> getRuangDosen() {
        return this.daftarRuangDosen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void addRuangDepartemen(RuangDepartemen ruangDepartemen) {
        this.daftarRuangDepartemen.add(ruangDepartemen);
    }
    
    public void addRuangDosen(RuangDosen ruangDosen) {
        this.daftarRuangDosen.add(ruangDosen);
    }

    public int jumlahRuangDepartemen() {
        return this.daftarRuangDepartemen.size();
    }

    public int jumlahRuangDosen() {
        return this.daftarRuangDosen.size();
    }
    
    public void tampilkanRuangDepartemen() {
        System.out.println("Departemen: " + nama);
        for (RuangDepartemen ruangDepartemen : daftarRuangDepartemen) {
            ruangDepartemen.printInfo();
            System.out.println("----------------");
        }
    }

    public void tampilkanRuangDosen() {
        System.out.println("Departemen: " + nama);
        for (RuangDosen ruangDosen : daftarRuangDosen) {
            ruangDosen.printInfo();
            System.out.println("----------------");
        }
    }

    public void printInfo() {
        System.out.println("Nama Departemen: " + this.nama);
        System.out.println("Jumlah Ruang Departemen: " + this.jumlahRuangDepartemen());
        System.out.println("Jumlah Ruang Dosen: " + this.jumlahRuangDosen());
    }
}