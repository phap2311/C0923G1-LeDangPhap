package ss3_method;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size: ");
        size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elment is " + i);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min of Array is " + min);

    }
}
