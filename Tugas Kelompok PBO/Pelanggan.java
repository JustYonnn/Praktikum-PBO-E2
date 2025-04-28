public class Pelanggan {
    private String idPelanggan;
    private static int counter = 1;
    private String nama;
    private String nomorIdentitas;
    private String nomorTelepon;
    private String email;

    public Pelanggan(){

    }

    public Pelanggan(String nama, String nomorIdentitas, String nomorTelepon, String email) {
        this.idPelanggan = "Cst-" + counter++;
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getIdPelanggan(){ 
        return this.idPelanggan; 
    }

    public String getNama(){ 
        return this.nama; 
    }

    public String getNomorIdentitas(){ 
        return this.nomorIdentitas; 
    }

    public String getNomorTelepon(){ 
        return this.nomorTelepon; 
    }

    public String getEmail(){ 
        return this.email; 
    }

    public void setIdPelanggan(String idPelanggan){ 
        this.idPelanggan = idPelanggan; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }

    public void setNomorIdentitas(String nomorIdentitas){ 
        this.nomorIdentitas = nomorIdentitas; 
    }

    public void setNomorTelepon(String nomorTelepon){ 
        this.nomorTelepon = nomorTelepon; 
    }

    public void setEmail(String email){ 
        this.email = email; 
    }

    public void printInfo() {
        System.out.println("ID Pelanggan    : " + idPelanggan);
        System.out.println("Nama            : " + nama);
        System.out.println("Nomor Identitas : " + nomorIdentitas);
        System.out.println("Nomor Telepon   : " + nomorTelepon);
        System.out.println("Email           : " + email);
    }
}
