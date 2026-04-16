package methods.methodOverRide;

public class addNumber {

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    static float add(float x, float y) {
        float z = x + y;
        return z;
    }

    static int add(int x, int y, int z) {
        int a = x + y + z;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 6));
    }
}
