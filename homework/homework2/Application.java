package homework.homework2;

public class Application {
    public static void main(String[] args) {

        Point upperLeftCorner = new Point(2.0, 3.0);
        Point bottomRightCorner = new Point(5.0, 1.0);
        Rectangle rectangle = new Rectangle(upperLeftCorner, bottomRightCorner);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateDiagonal());
    }
}
