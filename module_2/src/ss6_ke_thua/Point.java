package ss6_ke_thua;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    ;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.getX(), getY()};

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point(1.5f,2.5f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
