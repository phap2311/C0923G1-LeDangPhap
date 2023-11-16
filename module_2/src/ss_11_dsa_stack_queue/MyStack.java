package ss_11_dsa_stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9};
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            myStack.push(arr[i]);
        }
        System.out.println(myStack);
        while (!myStack.empty()) {
            System.out.println(myStack.pop());
        }
        String str = "le van an";
        String array[] = str.split(" ");
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            wStack.push(array[i]);
        }
        System.out.println(wStack);
        while (!wStack.empty()) {
            System.out.println(wStack.pop());
        }
    }
}

