package ss6_ke_thua.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return height * getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cyclinder = new Cylinder(1.0, "blue", 1.0);
        System.out.println(cyclinder);
        System.out.println("Volume cylinder is " + cyclinder.getVolume());
    }

}

