package ss5_access_modifier_static_method.circle;

public class Circle {
    private double radius;
    private String color;
    public static final double PI = 3.14;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * Math.pow(radius, 2);
    }

}





