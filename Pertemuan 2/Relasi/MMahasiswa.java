/* Nama File   : MMahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class mahasiswa
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 27 Februari 2025
 */

public class MMahasiswa{
    public static void main(String[] args) {
        MatKul PBO = new MatKul("PBO", "Pemrograman Berorientasi Objek", 3);
        MatKul MBD = new MatKul("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        M1.printDetailMhs();
        System.out.println("Jumlah mata kuliah : " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS : " + M1.getJumlahSKS());
    }
}