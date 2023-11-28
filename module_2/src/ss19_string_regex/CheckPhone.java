package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhone {
    private static final String ACCOUNT_PHONE_REGEX = "^//([0-9]{2}//)-//(0[0-9]{9}//)$";

    private static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = scanner.nextLine();
        System.out.println(validate(regex));
    }
}
