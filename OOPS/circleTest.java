package OOPS;

class Circle {
    public double radii;

    public double area() {
        return Math.PI * radii * radii;
    }

    public double perimeter() {
        return 2 * Math.PI * radii;
    }

}

public class circleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radii = 7;
        System.out.println("The area of Circle is " + c.area());
        System.out.println("The perimeter of Circle is " + c.perimeter());
    }

}
