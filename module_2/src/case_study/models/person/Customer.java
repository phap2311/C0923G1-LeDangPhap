package case_study.models.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    public static void main(String[] args) {
        int a[] = {7,5,-1,9,3,2};
        List<Integer> tree = new ArrayList<>();
        List<Integer> copyA = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                tree.add(i);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int j : a) {
            if (j != -1) {
                copyA.add(j);
            }
        }

        for(int j = 0; j < tree.size(); j++ ){
            copyA.add(tree.get(j),-1);
        }
        System.out.println(copyA);
        int[] result = new int[copyA.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = copyA.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
