package OOPS.InnerClass;

class Outer {
    int y = 10;

    class Inner {
        int x = 20;

        void innerDisplay() {
            System.out.println(x + " " + y);
        }

    }

    public void outerDisplay() {
        Inner in = new Inner();
        in.innerDisplay();
        System.out.println(in.x);
    }

}

public class nestedInner {

    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.outerDisplay();
    }

}
