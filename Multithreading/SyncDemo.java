package Multithreading;

class Mydata {
    synchronized public void display(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class MyThred extends Thread {
    Mydata d;

    public MyThred(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display(" hello ");
    }
}

class MyThred2 extends Thread {
    Mydata d;

    public MyThred2(Mydata d) {
        this.d = d;
    }

    public void run() {
        d.display(" welcome ");
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Mydata data = new Mydata();

        MyThred t1 = new MyThred(data);
        MyThred2 t2 = new MyThred2(data);

        t2.start();
        t1.start();
    }

}
