package methods.methodOverRide;

public class findArea {

    static double area(double x, double y) {
        System.out.print("area of rectangle is :");
        double z = x * y;
        return z;
    }

    static double area(double radii) {
        System.out.print("area of circle is :");
        double ar = 3.14 * radii * radii;
        return ar;
    }

    public static void main(String[] args) {
        System.out.println(area(78, 12));
    }
}
