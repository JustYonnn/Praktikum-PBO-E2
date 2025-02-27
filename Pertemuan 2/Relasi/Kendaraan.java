/* Nama File   : Kendaraan.java
 * Deskripsi   : berisi atribut dan method dalam class kendaraan
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 27 Februari 2025
 */

public class Kendaraan{
    /* Atribut */
    private String noPlat;
    private String Jenis;

    /* Method */
    /* Konstruktor */
    public Kendaraan(){

    }

    // Konstruktor objek kendaraan
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    /* Selektor */
    // Selektor noPlat
    public String getnoPlat(){
        return this.noPlat;
    }

    // Selektor Jenis
    public String getJenis(){
        return this.Jenis;
    }

    /* Mutator */
    // Mutator noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // Mutator Jenis
    public void setJenis(String Jenis){
        if (Jenis.equalsIgnoreCase("Motor") || Jenis.equalsIgnoreCase("Mobil")){
            this.Jenis = Jenis;
        }else{
            System.out.println("Jenis Kendaraan Harus Motor atau Mobil");
        }
    }
}