public class Main {
    public static void main(String[] args) {
        Person p = new Student("Sally");
        p.status(1);
        //Now online: Sally (this pada status() merujuk pada toString() yang mengeluarkan nama)
        //this dieksekusi saat runtime karena mengacu pada objek nyata "Sally"
    }
}