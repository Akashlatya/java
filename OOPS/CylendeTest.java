package OOPS;

class Cylender {
    private int radii;
    private int height;

    // Constractor peremetric or non-perametric
    public Cylender() {
        radii = height = 1;
    }

    public Cylender(int r, int h) {
        radii = r;
        height = h;
    }

    // geter and seter

    public int getRadii() {
        return radii;
    }

    public int getHeight() {
        return height;
    }

    public void setRadii(int r) {
        if (r >= 0)
            radii = r;
        else
            radii = 0;
    }

    public void setHeight(int h) {
        if (h >= 0)
            height = h;
        else
            height = 0;
    }

    public void setDimensions(int r, int h) {
        height = h;
        radii = r;
    }

    public double lidArea() {
        return Math.PI * radii * radii;
    }

    public double perimeter() {
        return 2 * Math.PI * radii;
    }

    public double drumArea() {
        return 2 * lidArea() + perimeter() * height;
    }

    public double volume() {
        return lidArea() * height;
    }

}

public class CylendeTest {
    public static void main(String[] args) {

        Cylender c = new Cylender();
        c.setRadii(7);
        c.setHeight(5);
        c.setDimensions(7, 5);

        System.out.println("LidArea " + c.lidArea());
        System.out.println("Circumference " + c.perimeter());
        System.out.println("totalSurfaceArea " + c.drumArea());
        System.out.println("Volume " + c.volume());
        System.out.println("Height" + c.getHeight());
        System.out.println("Radius" + c.getRadii());
    }
}
