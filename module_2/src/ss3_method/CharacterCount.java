package ss3_method;

import java.util.Scanner;

public class CharacterCount {
    public static int chrAt(String str, String character) {

        int count = 0;
        char temp = character.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == temp) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "weareone";
        String character;
        System.out.println("Enter character: ");
        character = scanner.nextLine();
        int result = chrAt(str, character);
        System.out.println("Number of occurrences of the character is " + result);

    }
}
