public class NonAnggota {
    private String nama;
    private static int counterNonAnggota = 0;

    @SuppressWarnings("static-access")
    public NonAnggota(String nama) {
        this.nama = nama;
        this.counterNonAnggota++;
    }

    public NonAnggota() {

    }

    public String getNama() {
        return this.nama;
    }

    @SuppressWarnings("static-access")
    public int getCounterNonAnggota() {
        return this.counterNonAnggota;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void printInfo() {
        System.out.println("Nama        : " + getNama());
    }    

    public void printJumlahNonAnggota() {
        System.out.println("Jumlah Non Anggota  : " + getCounterNonAnggota());
    }
}