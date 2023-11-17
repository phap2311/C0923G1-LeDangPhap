package ss_11_dsa_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        String str = string.toLowerCase();

        String arr[] = str.split("");
        Stack<String> palindrome = new Stack<>();
        Queue<String> dePalindrome = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            palindrome.push(arr[i]);
        }
        System.out.println(palindrome);

        for (int i = 0; i < arr.length; i++) {
            dePalindrome.add(arr[i]);
        }
        System.out.println(dePalindrome);
        int count = 0;
        while (!palindrome.isEmpty()) {
            if (!palindrome.pop().equals(dePalindrome.remove())) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }
}


