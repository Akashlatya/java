package OOPS;

class Rectangle {
    private double length;
    private double breadth;

    public double getlength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setlength(double l) {
        if (l > 0)
            length = l;
        else
            length = 0;
    }

    public void setbreadth(double b) {
        if (b > 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return getlength() * getbreadth();
    }

    public double perimeter() {
        return (2 * (length + breadth));
    }

    public boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }

}

public class rectnagleTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setlength(6.5);
        r.setbreadth(9.5);

        System.out.println("The Area of Rectangle is : " + r.area());
        System.out.println("The Area of Perimeter is : " + r.perimeter());
        System.out.println("Is Square " + r.isSquare());
    }
}
