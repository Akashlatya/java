package methods;

public class gcd {

    static int isGcd(int x, int y) {
        while (x != y) {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(isGcd(45, 65));
    }

}
