package ss19_string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String ACCOUNT_REGEX = "^[CAP][0-9]{4}[GHIK]$";

    private static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = scanner.nextLine();
        System.out.println(validate(regex));
    }
}
