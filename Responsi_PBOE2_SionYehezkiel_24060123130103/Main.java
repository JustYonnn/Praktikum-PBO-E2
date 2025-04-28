public class Main{
    public static void main(String[] args) {
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika");
        Departemen informatika = new Departemen("Informatika");
        RuangKelas kelas1 = new RuangKelas("A101", 10.0, 8.0, 40.0, 50, 40, 10);
        LabKomputer lab1 = new LabKomputer("LABIF1", 12.0, 10.0, 40.0, 20, "Lab Komputer AI", 500000, 30);
        RuangDepartemen dept1 = new RuangDepartemen("IF1010", 10.0, 8.0, 10.0, 30, 30, 30, 10, 500000);
        RuangDosen dos1 = new RuangDosen("DOS1", 15.0, 10.0, 10.0, 5, 5, 5, "Pak Adi");
        
        fsm.addRuangKelas(kelas1);
        fsm.addRuangLaboratorium(lab1);
        informatika.addRuangDepartemen(dept1);
        informatika.addRuangDosen(dos1);
        
        System.out.println("---Informasi Fakultas---");
        fsm.printInfo();
        System.out.println("");
        System.out.println("---Ruang Kelas yang Dimiliki Fakultas---");
        fsm.tampilkanRuangKelas();
        System.out.println("");
        System.out.println("---Ruang Lab yang Dimiliki Fakultas---");
        fsm.tampilkanRuangLaboratorium();
        System.out.println("");
        System.out.println("---Informasi Departemen---");
        informatika.printInfo();
        System.out.println("");
        System.out.println("---Ruang Departemen yang Dimiliki Departemen---");
        informatika.tampilkanRuangDepartemen();
        System.out.println("");
        System.out.println("Ruang Dosen yang Dimiliki Departemen");
        informatika.tampilkanRuangDosen();
        System.out.println("");
        System.out.println("---Informasi Ruang Kelas---");
        kelas1.printInfo();
        System.out.println("");
        System.out.println("---Informasi Ruang Lab---");
        lab1.printInfo();
        System.out.println("");
        System.out.println("---Informasi Ruang Departemen---");
        dept1.printInfo();
        System.out.println("");
        System.out.println("---Informasi Ruang Dosen---");
        dos1.printInfo();
    }
}