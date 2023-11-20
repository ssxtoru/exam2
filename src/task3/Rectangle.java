package task3;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Rectangle's perimeter: " + (2*length) + (2*width));
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle's area: " + length*width);
    }
}
