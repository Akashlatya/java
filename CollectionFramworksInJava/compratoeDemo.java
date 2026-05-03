package CollectionFramworksInJava;

import java.util.Arrays;

public class compratoeDemo {
    public static void main(String[] args) {
        Integer a[] = { 4, 3, 1, 12, 6, 90, 7, 8, };
        // int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // System.out.println(Arrays.compare(a, b));
        Arrays.sort(a);
        for (Integer x : a)
            System.out.println(x);
    }
}
