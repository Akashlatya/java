package OOPS.Inheritance;

class CircleTest {
    double radii;

    public double area() {
        return Math.PI * radii * radii;
    }

    public double perimeter() {
        return 2 * Math.PI * radii;
    }

}

class Cylinder extends CircleTest {
    double Height;

    public double volume() {
        return (area() * Height);
    }
}

public class Circle {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.Height = 7;
        c.radii = 6.6;
        System.out.println("Area :" + c.area());
        System.out.println("perimeter :" + c.perimeter());
        System.out.println("volume :" + c.volume());
    }

}
