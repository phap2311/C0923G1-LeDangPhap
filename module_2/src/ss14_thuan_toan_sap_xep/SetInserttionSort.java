package ss14_thuan_toan_sap_xep;

import java.util.Arrays;

public class SetInserttionSort {
    public static void main(String[] args) {
        int[] list = {7, 4, 9, 2, 5};
        System.out.println("Mảng sau khi sắp xếp" + Arrays.toString(insertionSort(list)));
    }

    public static int[] insertionSort(int[] list) {
        int x, index;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            index = i;
            while (index > 0 && x < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = x;
        }


        return list;
    }
}
