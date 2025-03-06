/* Nama File   : ExceptionOnArray.java
 * Deskripsi   : program untuk menunjukkan eksepsi menggunakan class library java
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 6 Maret 2025
 */

public class ExceptionOnArray{
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}