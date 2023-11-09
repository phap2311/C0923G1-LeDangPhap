package ss5_access_modifier_static_method.circle;

public class Circle {
    private double radius;
    private String color;
    public static final double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.setRadius(1.0);
        this.setColor("red");
    }
}




