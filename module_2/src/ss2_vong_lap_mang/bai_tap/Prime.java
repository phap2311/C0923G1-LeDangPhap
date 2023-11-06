package ss2_vong_lap_mang.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        numbers = scanner.nextInt();
        int countPrime = 0;
        int n = 2;
        System.out.printf("%d prime ís : ", (numbers + 1));
        System.out.println();

        while (countPrime < numbers) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.printf("%d", n);
                System.out.println();
                countPrime++;
            }
            n++;

        }

    }

}
