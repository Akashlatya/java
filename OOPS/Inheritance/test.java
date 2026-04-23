package OOPS.Inheritance;

class Supper {
    public Supper() {
        System.out.println("Supper class");
    }
}

class Sub extends Supper {
    public Sub() {
        System.out.println("sub class ");
    }
}

public class test {
    public static void main(String[] args) {

        Supper sb = new Sub();

    }

}
