package ss13_Thuat_toan_tim_kiem;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        int[] freuentChar = new int[255];
        int ascii;
        for (int i = 0; i < str.length(); i++) {
            ascii = (int) str.charAt(i);
            freuentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (freuentChar[i] > max) {
                max = freuentChar[i];
                character = (char) i;
            }

        }
        System.out.println("The most appearing letter is " + character + " with a frequency of " + max + " time");

    }
}
