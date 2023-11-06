package ss2_vong_lap_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ElementIsRemoved {


    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int x;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter x: ");
        x = scanner.nextInt();
        int index = 0;
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]) {
                array[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
