package homework.homework7;

import homework.homework7.circle.Circle;
import homework.homework7.quadrangle.Parallelogram;
import homework.homework7.quadrangle.Quadrangle;
import homework.homework7.quadrangle.Square;
import homework.homework7.triangle.EquilateralTriangle;
import homework.homework7.triangle.Triangle;

public class Application {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle);
        System.out.println(circle.getDiameter());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());

        Quadrangle parallelogram = new Parallelogram(5.0, 2.0);
        System.out.println(parallelogram);
        System.out.println(parallelogram.getPerimeter());
        System.out.println(parallelogram.getSquare());
        System.out.println(circle.isSquareEqual(parallelogram));

        Quadrangle square = new Square(4.0);
        System.out.println(square);
        System.out.println(square.getPerimeter());
        System.out.println(square.getPerimeter());

        Triangle triangle = new EquilateralTriangle(4.0);
        System.out.println(triangle);
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());

        System.out.println(ShapeUtils.isCircle(circle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(ShapeUtils.isTriangle(circle));
        System.out.println(ShapeUtils.isQuadrangle(parallelogram));
    }
}
