package ss14_thuan_toan_sap_xep;

import java.util.Arrays;

public class DisplayInsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 6, 4, 8, 2, 5};
        int x;
        int index;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            index = i;
            while (index > 0 && x < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = x;
            System.out.println("Position is " + i + Arrays.toString(array));

        }
        System.out.println(Arrays.toString(array));
    }
}
