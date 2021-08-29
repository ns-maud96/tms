package homework.homework7.triangle;

public class EquilateralTriangle extends Triangle {

    private double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 3 * getLength();
    }

    @Override
    public double getSquare() {
        return (Math.sqrt(3) / 2) * Math.pow(getLength(), 2);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "length=" + length +
                '}';
    }
}
