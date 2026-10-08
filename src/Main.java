import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(201, "Ali");
        map.put(202, "Vali");
        map.put(203, "Aysel");
        map.put(204, "Nigar");
        map.put(202, "Fuad");

        System.out.println(map.remove(204));
        System.out.println(map.size());
        System.out.println(map.get(202));

        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            Integer id = entry.getKey();
            String ad = entry.getValue();

            System.out.println( id + ad );


        }
    }
}
