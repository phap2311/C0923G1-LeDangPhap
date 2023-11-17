package ss_11_dsa_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalTranferBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal: ");
        int decimal = scanner.nextInt();
        Stack<Integer> binary = new Stack<>();

        for (int i = decimal; i >= 1; i = i / 2) {
            if (i % 2 == 0) {
                binary.push(0);
            } else {
                binary.push(1);
            } 
        }

        while (!binary.empty()) {
            System.out.print(binary.pop());
        }
    }
}
