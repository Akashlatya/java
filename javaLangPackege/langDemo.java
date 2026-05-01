package javaLangPackege;

import java.lang.*;

class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 432;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    // public void notify() {}
}

public class langDemo {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o1.getClass());
    }
}
