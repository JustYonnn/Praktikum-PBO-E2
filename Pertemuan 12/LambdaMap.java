
import java.util.HashMap;
import java.util.Map;

 public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123120003", "Umar Faqih");
        mahasiswaMap.put("24060123130103", "Sion Yehezkiel");
        mahasiswaMap.put("24060123140182", "Zoe Mohamed");
        mahasiswaMap.put("24060123130115", "Sulhan Fuadi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM : " + key + " Nama : " + value));
    }
}
