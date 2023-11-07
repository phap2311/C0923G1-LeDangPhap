package ss2_vong_lap_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ElementIsAdded {
    static int array[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        int x;
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        int index;
        System.out.println("Enter index: ");
        index = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + i + " : ");
            array[i] = scanner.nextInt();
        }

        while (index <= -1 || index >= array.length - 1) {
            System.out.println("Enter index: ");
            index = scanner.nextInt();
        }
        int arr[] = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    arr[i] = array[j];
                }

            }

        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i + 1] = array[i];

        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }

}



