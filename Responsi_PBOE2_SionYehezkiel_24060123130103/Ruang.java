public class Ruang {
    protected String kode;
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected int kapasitas;
    
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }

    public String getKode() {
        return this.kode;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    public double hitungBiayaKebersihan(double tarif) {
        return hitungLuas() * tarif;
    }
    
    public void printInfo() {
        System.out.println("Kode Ruang: " + this.kode);
        System.out.println("Luas: " + this.hitungLuas() + " m2");
        System.out.println("Kapasitas: " + this.kapasitas);
    }
}
