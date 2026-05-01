package CollectionFramworksInJava;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(3);
        p.add(5);
        p.add(6);
        p.add(7);
        p.add(8);
        p.add(9);

        System.out.println(p.peek());
        // p.forEach(x -> System.out.println(x));
    }
}
