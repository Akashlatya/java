package CollectionFramworksInJava;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(34);
        hs.add(3);
        hs.add(4);
        hs.add(4);
        hs.add(23);
        hs.add(37);
        hs.add(39);
        System.out.println(hs);
        System.out.println(hs.hashCode());
    }
}
