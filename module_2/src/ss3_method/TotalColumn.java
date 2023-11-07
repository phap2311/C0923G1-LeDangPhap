package ss3_method;

import java.util.Scanner;

public class TotalColumn {
    public static int sum(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        int index;
        System.out.println("Enter column you want to sum: ");
        index = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (index == j) {
                    total += array[i][j];
                }
            }

        }
        return total;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter row is x:");
        x = scanner.nextInt();
        int y;
        System.out.println("Enter column is y:");
        y = scanner.nextInt();
        int array[][] = new int[x][y];
        System.out.println("Total columns is: " + sum(array));

    }

}
