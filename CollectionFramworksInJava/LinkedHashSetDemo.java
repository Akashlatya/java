package CollectionFramworksInJava;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> lhs = new HashSet<>(5);

        lhs.add("A");
        lhs.add("B");
        lhs.add("K");
        lhs.add("J");
        lhs.add("E");
        lhs.add("F");
        lhs.add("A");
        lhs.add("G");
        lhs.forEach(System.out::println);
    }

}
