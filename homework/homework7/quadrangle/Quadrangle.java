package homework.homework7.quadrangle;

import homework.homework7.GeometricShape;

public class Quadrangle implements GeometricShape {

    private double length;
    private double width;

    public Quadrangle(double length) {
        this.length = length;
    }

    public Quadrangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public double getSquare() {
        return getWidth() * getLength();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Quadrangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
