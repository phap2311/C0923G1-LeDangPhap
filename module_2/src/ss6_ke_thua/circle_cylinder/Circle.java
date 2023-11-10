package ss6_ke_thua.circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "blue";
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        System.out.println(circle);
        System.out.println("Area circle is " + circle.getArea());

    }
}



