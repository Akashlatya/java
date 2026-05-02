package CollectionFramworksInJava;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "a", 2, "B", 3, "C"));

        tm.put(5, "E");
        tm.put(6, "F");

        System.out.println(tm.get(6));
        System.out.println(tm);
    }
}
