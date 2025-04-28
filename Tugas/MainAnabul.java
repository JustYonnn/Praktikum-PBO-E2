import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        ArrayList<Anabul> anabuls = new ArrayList<>();

        anabuls.add(new Kucing("Meng"));
        anabuls.add(new Anjing("Chiko"));
        anabuls.add(new Burung("Tweety"));

        for (Anabul anabul : anabuls) {
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}
