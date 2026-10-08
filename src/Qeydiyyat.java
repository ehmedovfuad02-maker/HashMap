import java.util.HashMap;
import java.util.Map;

public class Qeydiyyat {
    public static void main(String[] args) {

        Map<Integer, String> telebeler = new HashMap<>();

        telebeler.put(101, "Ali");
        telebeler.put(102, "Vali");
        telebeler.put(103, "Aysel");
        telebeler.put(104, "Nigar");

        String put = telebeler.put(102, "Elvin");
        System.out.println("--- Təkrar Açar Əməliyyatı ---");
        System.out.println("Nə baş verdi?: 102 açarının köhnə dəyəri silindi və 'Elvin' ilə əvəzləndi.");
        System.out.println("put nə qaytardı?: " );

        System.out.println("\n--- Axtarış Əməliyyatları ---");
        System.out.println("103 nömrəli tələbə: " + telebeler.get(103));
        System.out.println("999 nömrəli tələbə: " + telebeler.getOrDefault(999, "Tapılmadı"));

        System.out.println("105 nömrəli tələbə varmı?: " + telebeler.containsKey(105));

        System.out.println("\n--- Silmə Əməliyyatları ---");
        String silinenAd = telebeler.remove(101);
        System.out.println( silinenAd);

        String olmayanacarnetice = telebeler.remove(500);
        System.out.println("Olmayan acar (500) silindikdə nə qaytırır?: " + olmayanacarnetice);

        System.out.println("\n--- yekun map  ---");
        System.out.println("Map-in ölçüsü: " + telebeler.size());
        System.out.println("Map-in tam olcusu: " + telebeler);
    }
}