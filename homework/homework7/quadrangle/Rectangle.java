package homework.homework7.quadrangle;

public class Rectangle extends Quadrangle {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getDiagonal(double length, double width) {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
