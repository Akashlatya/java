
import java.util.*;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Akash");
        list.add("is");
        list.add("learning");

        System.out.println(list);

        list.addFirst("The");
        list.addLast("Java");

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

    }

}
