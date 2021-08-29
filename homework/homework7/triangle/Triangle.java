package homework.homework7.triangle;

import homework.homework7.GeometricShape;

public class Triangle implements GeometricShape {

    private double firstLength;
    private double secondLength;
    private double thirdLength;
    private double heightToFirstLength;

    public Triangle() {
    }

    public Triangle(double firstLength, double secondLength, double thirdLength, double heightToFirstLength) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.thirdLength = thirdLength;
        this.heightToFirstLength = heightToFirstLength;
    }

    @Override
    public double getPerimeter() {
        return getFirstLength() + getSecondLength() + getThirdLength();
    }

    @Override
    public double getSquare() {
        return 0.5 * getFirstLength() * getHeightToFirstLength();
    }

    public double getFirstLength() {
        return firstLength;
    }

    public void setFirstLength(double firstLength) {
        this.firstLength = firstLength;
    }

    public double getSecondLength() {
        return secondLength;
    }

    public void setSecondLength(double secondLength) {
        this.secondLength = secondLength;
    }

    public double getThirdLength() {
        return thirdLength;
    }

    public void setThirdLength(double thirdLength) {
        this.thirdLength = thirdLength;
    }

    public double getHeightToFirstLength() {
        return heightToFirstLength;
    }

    public void setHeightToFirstLength(double heightToFirstLength) {
        this.heightToFirstLength = heightToFirstLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstLength=" + firstLength +
                ", secondLength=" + secondLength +
                ", thirdLength=" + thirdLength +
                ", heightToFirstLength=" + heightToFirstLength +
                '}';
    }
}
