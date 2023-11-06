package ss2_vong_lap_mang.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i ==  0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(number + " is not a prime");
        } else {
            System.out.println(number + " is a prime");

        }
    }
}
