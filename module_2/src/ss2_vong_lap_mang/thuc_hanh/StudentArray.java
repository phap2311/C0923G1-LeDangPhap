package ss2_vong_lap_mang.thuc_hanh;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] studens = {"Hoa", "Hong", "Hanh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's studen: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(inputName)) {
                System.out.println("Position of the students is the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + inputName + "in the list");
        }
    }
}
