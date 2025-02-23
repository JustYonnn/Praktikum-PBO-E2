/* Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class titik
 * Pembuat     : Sion Yehezkiel Pardomuan - 24060123130103
 * Tanggal     : 20 Februari 2025
 */

public class Titik {
    /* Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;


    /* Method */
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    // Getter
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    // Setter
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }

    int getKuadran(){
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

    double getJarakPusat(){
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    double getJarakTitik(Titik T){
        double a = this.absis - T.getAbsis();
        double b = this.ordinat - T.getOrdinat();
        return Math.sqrt(a*a + b*b);
    }

    void refleksiX(){
        absis = -absis;
    }

    void refleksiY(){
        ordinat = -ordinat;
    }

    Titik getRefleksiX(){
        return new Titik(-absis, ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(absis, -ordinat);
    }
}