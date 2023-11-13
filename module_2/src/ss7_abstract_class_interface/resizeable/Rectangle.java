package ss7_abstract_class_interface.resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 2.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", Area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 3.2);
        System.out.println(rectangle);
        rectangle.resize(0.2);
        System.out.println(rectangle);

    }

    @Override
    public void resize(double percent) {
        width = width * (1 + percent);
        length = length * (1 + percent);
    }
}
