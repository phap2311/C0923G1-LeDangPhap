package ss2_vong_lap_mang.bai_tap;

import java.util.Scanner;

public class PrimeLessOneHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime numbers less than 100 are: ");
        int count;
        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 0) {
                System.out.printf("%d", i);
                System.out.println();
            }

        }
    }
}
