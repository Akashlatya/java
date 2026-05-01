package CollectionFramworksInJava;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>(20);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(12, 23, 44, 56, 43, 22, 11));

        arr1.add(0, 2);
        arr1.add(1, 1);
        arr1.addAll(2, arr2);

        // System.out.println(arr1.size());
        // System.out.println(arr1.contains(7));
        System.out.println(arr1.set(5, 40));

        // for (int i = 0; i < arr1.size(); i++)
        // System.out.println(arr1.get(i));
        // System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        // for (var x : arr2)
        // System.out.println(x);

        // arr1.forEach(n -> System.out.println(n));
        // arr1.forEach(System.out::println);

        arr1.forEach(n -> show(n));

    }

    static void show(int n) {
        if (n > 40)
            System.out.println(n);

    }

}
