package homework.homework2;

public class Rectangle {

    Point upperLeftCorner;
    Point bottomRightCorner;

    public Rectangle() {
    }

    public Rectangle(Point upperLeftCorner, Point bottomRightCorner) {
        this.upperLeftCorner = upperLeftCorner;
        this.bottomRightCorner = bottomRightCorner;
    }

    public double calculateArea() {
        return (upperLeftCorner.getY() - bottomRightCorner.getY()) *
                (bottomRightCorner.getX() - upperLeftCorner.getX());
    }

    public double calculatePerimeter() {
        return ((upperLeftCorner.getY() - bottomRightCorner.getY()) +
                (bottomRightCorner.getX() - upperLeftCorner.getX())) * 2;
    }

    public double calculateDiagonal() {
        return upperLeftCorner.distance(bottomRightCorner);
    }
}
