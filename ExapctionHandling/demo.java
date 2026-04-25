package ExapctionHandling;

public class demo {
    public static void main(String[] args) {
        int a, b, c;

        a = 5;
        b = 0;

        try {
            c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("denominator should not be ZERO , try again");
        }

        System.out.println("bye");
    }

}
