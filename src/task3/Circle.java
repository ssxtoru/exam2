package task3;

public class Circle extends Shape{
    private Double radius;
    private Double pi = 3.1415;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle's perimeter: " + 2*pi*radius);
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle's area: " + pi * Math.pow(2,radius));

    }
}

