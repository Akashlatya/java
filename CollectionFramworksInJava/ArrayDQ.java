package CollectionFramworksInJava;

import java.util.*;

public class ArrayDQ {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach(x -> System.out.println(x));
        dq.pollLast();
        System.out.println("after the deletion");
        dq.forEach(x -> System.out.println(x));
    }
}