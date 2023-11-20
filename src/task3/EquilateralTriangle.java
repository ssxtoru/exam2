package task3;

public class EquilateralTriangle extends Shape {

    private Double side;

    public EquilateralTriangle(Double side) {
        this.side = side;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Equilateral Triangle's perimeter: " + 3*side);
    }

    @Override
    public void calculateArea() {
        System.out.println("Equilateral Triangle's area: " + Math.sqrt(3)/4 * Math.pow(2,side));
    }
}
