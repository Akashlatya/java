package Multithreading;

public class demo {
    static void display() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public static void main(String[] args) {

        display();
        int i = 1;
        while (true) {
            System.out.println(i + "Bey");
            i++;

        }

    }
}