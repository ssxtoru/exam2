package task3;

public class  GeometryCalculator{
    public static void main(String[] args) {
        EquilateralTriangle triangle = new EquilateralTriangle(5.0);
        Rectangle rectangle = new Rectangle(3.0,4.5);
        Circle circle = new Circle(12.3);

        System.out.println();
        triangle.calculatePerimeter();
        triangle.calculateArea();
        System.out.println();

        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        System.out.println();

        circle.calculatePerimeter();
        circle.calculateArea();
    }
}
