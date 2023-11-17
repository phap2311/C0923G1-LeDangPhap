package ss12_java_collection_framework;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = input.nextLine().toLowerCase();
        Map<String, Integer> myMap = new TreeMap<>();
        System.out.println(str);
        String arr[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (myMap.containsKey(arr[i])) {
                count = myMap.get(arr[i]);
                myMap.put(arr[i], count + 1);

            } else {
                myMap.put(arr[i], 1);
            }
        }
        System.out.println(myMap);
    }
}