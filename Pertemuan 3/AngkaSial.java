/* Nama File   : AngkaSial.java
 * Deskripsi   : program untuk menunjukkan eksepsi menggunakan class library java
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 6 Maret 2025
 */

public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new  AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jelaskan pada lembar praktikum anda !

// jawaban : Baris 12 dieksekusi untuk cobaAngka(10) karena tidak menimbulkan eksepsi 
// namun di cobaAngka(13) tidak dieksekusi karena langsung melompat ke catch ketika menemukan eksepsi

//baris 21 dieksekusi setelah membaca cobaAngka(13) 
// karena adanya eksepsi yang kemudian ditangkap oleh fungsi catch