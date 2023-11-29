package case_study.util;

import java.util.Scanner;

public class ErrorException {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkChoice() {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error number format exception");
            }
        }
        return num;
    }
}
