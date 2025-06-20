/**
 * Nama File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 * Pembuat : Sion Yehezkiel / 24060123130103
 * Tanggal : 1 Mei 2025
 */
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
