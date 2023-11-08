package ss3_method;

import java.util.Scanner;

public class TotalDiagonal {
    public static int sum(int[][] array) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element is: " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter n is the square side of array: ");
        n = scanner.nextInt();
        int array[][] = new int[n][n];
        System.out.println("Total numbes of main diagonal is " + sum(array));
    }
}
