package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class NumbersIntoWord {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbe: ");
        number = scanner.nextInt();
        String[] num = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen"};
        if (number > 0 && number <= 13) {
            System.out.printf("%d is %s", number, num[number]);
        } else if (number > 13 && number < 20) {
            System.out.printf("%d is %steen", number, num[number - 10]);

        } else if (number >= 20 && number < 29) {
            System.out.printf("%d is twenty%s", number, num[number % 10]);

        } else if (number >= 30 && number < 39) {
            System.out.printf("%d is thirty%s", number, num[number % 10]);

        } else if (number >= 40 && number < 99) {
            System.out.printf("%d is %sty %s ", number, num[number / 10], num[number % 10]);
        } else if (number >= 100 && number <= 113) {
            System.out.printf("%d is %shundred and %s ", number, num[number / 100], num[number % 100]);
        } else if (number >= 114 && number <= 119) {
            System.out.printf("%d is %shundred %steen ", number, num[number / 100], num[(number % 100) % 10]);
        } else if (number >= 120 && number <= 129) {
            System.out.printf("%d is %shundred twenty%s ", number, num[number / 100], num[(number % 100) % 10]);
        } else if (number >= 130 && number < 140) {
            System.out.printf("%d is %shundred thirty%s ", number, num[number / 100], num[(number % 100) % 10]);
        } else if (number >= 130 && number < 1000) {
            System.out.printf("%d is %shundred %sty %s ", number, num[number / 100], num[(number % 100) / 10], num[(number % 100) % 10]);
        }
    }
}



