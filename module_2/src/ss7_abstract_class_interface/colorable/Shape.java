package ss7_abstract_class_interface.colorable;


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

        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle(2.0);
        arrShape[1] = new Rectangle(2.0, 2.5);
        arrShape[2] = new Square(3.0);
        for (int i = 0; i < arrShape.length; i++) {
            if (arrShape[i] instanceof Square) {
                ((Square) arrShape[i]).howToColor();
            } else if (arrShape[i] instanceof Rectangle) {
                System.out.println("Area of rectangle is " + ((Rectangle) arrShape[i]).getArea());
            } else if (arrShape[i] instanceof Circle) {
                System.out.println(" of circle is " + ((Circle) arrShape[i]).getArea());
            }
        }

        System.out.println(Arrays.toString(arrShape));

    }
}


