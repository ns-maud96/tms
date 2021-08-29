package homework.homework7.quadrangle;

public class Square extends Quadrangle {

    public Square(double length) {
        super(length);
    }

    @Override
    public double getPerimeter() {
        return 4 * getLength();
    }

    @Override
    public double getSquare() {
        return Math.pow(getLength(), 2);
    }

    public double getDiagonal(double length) {
        return Math.sqrt(2) * length;
    }
}
