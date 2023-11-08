package ss4_lop_doituong;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow((b * b) - 4 * a * c, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow((b * b) - 4 * a * c, 0.5)) / (2 * a);
    }

    public double getRoot() {
        return (-b) / (2 * a);
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a:");
            double a = scanner.nextDouble();
            System.out.println("Enter b:");
            double b = scanner.nextDouble();
            System.out.println("Enter c:");
            double c = scanner.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("The equation has 2 solution: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());

            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("The equation has 1 solution: " + quadraticEquation.getRoot());
            } else {
                System.out.println("The equation has no solution");
            }
        }
    }




