package Multithreading;

public class TreadUsingExtands extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "hello");
            i++;
        }
    }

    public class threadUsingExtends {

        public static void main(String[] args) {
            TreadUsingExtands t = new TreadUsingExtands();
            t.start();
            int i = 1;
            while (true) {
                System.out.println(i + "byyyy");
                i++;
            }
        }

    }

}
