package CollectionFramworksInJava;

import java.util.BitSet;

public class BitSeDemo {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(5);
        bs.set(6);

        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(3);
        bs1.set(4);
        bs1.set(5);
        bs1.set(6);

        bs.and(bs1);

        System.out.println(bs);
    }
}
