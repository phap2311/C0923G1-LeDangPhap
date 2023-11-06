package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        int money;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = scanner.nextInt();
        int rate = money * 23000;
        System.out.printf(money + " USD equals " + rate + " VND ");
    }
}
