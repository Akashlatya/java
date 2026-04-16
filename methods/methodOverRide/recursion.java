package methods.methodOverRide;

public class recursion {

    void fun(int n) {

        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        recursion r = new recursion();
        r.fun(9);
    }
}
