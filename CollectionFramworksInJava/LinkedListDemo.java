package CollectionFramworksInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> arr1 = new LinkedList<>();
        LinkedList<Integer> arr2 = new LinkedList<>(List.of(12, 23, 44, 56, 43, 22, 11));

        arr1.add(0, 2);
        arr1.add(1, 1);
        arr1.addAll(2, arr2);

        arr1.forEach(n -> System.out.println(n));
        arr1.forEach(System.out::println);
    }

}
