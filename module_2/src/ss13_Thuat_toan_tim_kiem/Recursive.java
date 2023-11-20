package ss13_Thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter emplement " + i);
            array[i] = scanner.nextInt();
        }

        int min;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    min = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập giá trị value");
        int value = scanner.nextInt();
        System.out.println(binarySearch(array, 0, array.length - 1, value));

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left <= right) {
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                binarySearch(array, middle + 1, right, value);
            } else {
                binarySearch(array, left, middle - 1, value);
            }
        }
        return -1;
    }
}

