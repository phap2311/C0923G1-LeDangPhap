package ss7_abstract_class_interface.resizeable;

import java.util.Arrays;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {

        Shape[] arrShape = new Shape[]{new Circle(2), new Rectangle(2.0, 2.5), new Square(3.1)};
        System.out.println(Arrays.toString(arrShape));

        double a = 1 + (Math.random() * 100);
        for (int i = 0; i < arrShape.length; i++) {
            if (arrShape[i] instanceof Circle) {
                ((Circle) arrShape[i]).resize(a);

            }
            if (arrShape[i] instanceof Rectangle) {
                ((Rectangle) arrShape[i]).resize(a);

            }
            if (arrShape[i] instanceof Square) {
                ((Square) arrShape[i]).resize(a);
            }

        }
        System.out.println(Arrays.toString(arrShape));

    }
}


