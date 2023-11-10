package ss5_access_modifier_static_method.circle;

import ss5_access_modifier_static_method.circle.Circle;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Area is " + circle.getArea());
    }
}
