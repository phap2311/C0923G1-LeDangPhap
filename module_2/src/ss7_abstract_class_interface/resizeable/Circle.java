package ss7_abstract_class_interface.resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area =" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "yellow", true);
        System.out.println(circle);
        circle.resize(0.2);
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        radius = radius * (1 + percent);
    }
}
