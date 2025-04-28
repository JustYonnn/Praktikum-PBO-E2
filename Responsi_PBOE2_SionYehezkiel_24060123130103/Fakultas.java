import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fakultas {
    private String nama;
    private List<RuangKelas> daftarRuangKelas = Collections.emptyList();
    private List<RuangLaboratorium> daftarRuangLaboratorium = Collections.emptyList();
    
    public Fakultas(String nama) {
        this.nama = nama;
        this.daftarRuangKelas = new ArrayList<>();
        this.daftarRuangLaboratorium = new ArrayList<>();
    }

    public String getNama() {
        return this.nama;
    }

    public List<RuangKelas> getRuangKelas() {
        return this.daftarRuangKelas;
    }

    public List<RuangLaboratorium> getRuangLaboratorium() {
        return this.daftarRuangLaboratorium;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void addRuangKelas(RuangKelas ruangKelas) {
        this.daftarRuangKelas.add(ruangKelas);
    }

    public void addRuangLaboratorium(RuangLaboratorium ruangLaboratorium) {
        this.daftarRuangLaboratorium.add(ruangLaboratorium);
    }

    public int jumlahRuangKelas() {
        return this.daftarRuangKelas.size();
    }

    public int jumlahRuangLaboratorium() {
        return this.daftarRuangLaboratorium.size();
    }
    
    public void tampilkanRuangKelas() {
        System.out.println("Fakultas: " + nama);
        for (RuangKelas ruangKelas : daftarRuangKelas) {
            ruangKelas.printInfo();
            System.out.println("----------------");
        }
    }

    public void tampilkanRuangLaboratorium() {
        System.out.println("Fakultas: " + nama);
        for (RuangLaboratorium ruangLaboratorium : daftarRuangLaboratorium) {
            ruangLaboratorium.printInfo();
            System.out.println("----------------");
        }
    }

    public void printInfo() {
        System.out.println("Fakultas: " + this.nama);
        System.out.println("Jumlah Ruang Kelas: " + this.jumlahRuangKelas());
        System.out.println("Jumlah Ruang Laboratorium: " + this.jumlahRuangLaboratorium());
    }
}