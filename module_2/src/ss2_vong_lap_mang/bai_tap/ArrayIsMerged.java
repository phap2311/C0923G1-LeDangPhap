package ss2_vong_lap_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsMerged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[4];
        int arr[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" + i + " : ");
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element" + i + " : ");
            arr[i] = scanner.nextInt();
        }
        int arrTotal[] = new int[9];
        for (int i = 0; i < arrTotal.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    arrTotal[i] = array[j];
                }
            }
        }
        for (int i = array.length; i < arrTotal.length; i++) {
            arrTotal[i] = arr[i - array.length];
        }


        System.out.println(Arrays.toString(arrTotal));
    }
}

