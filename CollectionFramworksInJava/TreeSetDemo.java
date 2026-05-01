package CollectionFramworksInJava;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(3, 10, 59, 4, 12, 21, 13, 14, 15, 25));

        ts.add(30);

        System.out.println(ts.ceiling(5));

        System.out.println(ts);
    }

}
