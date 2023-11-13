package ss7_abstract_class_interface.resizeable;

public class Square extends Rectangle implements Resizeable {


    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + getSide() +
                ", Area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(10);
        System.out.println(square);
        square = new Square("yellow", true, 6);
        System.out.println(square);
        square.resize(0.2);
        System.out.println(square);
    }


}
