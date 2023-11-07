package ss3_method;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[4][5];
        System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element is " + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        int x = 0;
        int y = 0;
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max equal " + max + "\n" + " mode is" + x + "," + y);
    }
}