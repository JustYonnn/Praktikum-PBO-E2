/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class titik
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Februari 2025
 */

public class Titik {
    /* Atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;


    /* Method */
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public Titik(){
        this(0,0);
    }

    // Getter
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    // Setter
    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    public int getKuadran(){
        if ((absis > 0) && (ordinat > 0)){
            return 1;
        }else if ((absis < 0) && (ordinat > 0)){
            return 2;
        }else if ((absis < 0) && (ordinat < 0)){
            return 3;
        }else if ((absis > 0) && (ordinat < 0)){
            return 4;
        }else{
            return -1;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public double getJarakTitik(Titik T){
        double a = this.absis - T.getAbsis();
        double b = this.ordinat - T.getOrdinat();
        return Math.sqrt(a*a + b*b);
    }

    public void refleksiX(){
        absis = -absis;
    }

    public void refleksiY(){
        ordinat = -ordinat;
    }

    public Titik getRefleksiX(){
        return new Titik(-absis, ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(absis, -ordinat);
    }
}