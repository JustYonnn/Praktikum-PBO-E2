public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calrent(50, 1000); //50000.0
        mobil.calrent(50, 1000); //49900.0
        bis.calrent(50, 1000); //50000.0
        //hitungSewa(Vehicle v) dengan teknik inclusion akan membuat kode lebih sederhana dan fleksibel
        //karena tetap dapat diimplementasikan pada subclass yang ada dengan diperlakukan
        //sebagai superclass nya, dan hal itu juga mendukung prinsip OOP
    }
}