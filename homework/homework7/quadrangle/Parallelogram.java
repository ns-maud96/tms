package homework.homework7.quadrangle;

public class Parallelogram extends Quadrangle {

    private double height;
    private double angleBetweenSides;

    public Parallelogram(double length, double height) {
        super(length);
        this.height = height;
    }

    public Parallelogram(double length, double width, double angleBetweenSides) {
        super(length, width);
        this.angleBetweenSides = angleBetweenSides;
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() * getWidth());
    }

    @Override
    public double getSquare() {
        return getLength() * getHeight();
    }

    public double getSquare(double length, double width, double angleBetweenSides) {
        return length * width * Math.sin(angleBetweenSides);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAngleBetweenSides() {
        return angleBetweenSides;
    }

    public void setAngleBetweenSides(double angleBetweenSides) {
        this.angleBetweenSides = angleBetweenSides;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "height=" + height +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                ", angleBetweenSides=" + angleBetweenSides +
                '}';
    }
}
