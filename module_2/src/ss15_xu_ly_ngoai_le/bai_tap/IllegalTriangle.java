package ss15_xu_ly_ngoai_le.bai_tap;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b");
        int b = scanner.nextInt();
        System.out.println("nhập vào cạnh c");
        int c = scanner.nextInt();
        try {
            inputTriangle(a, b, c);
            System.out.println("Đây là một tam giác");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Đã hoàn thành");
        }


    }

    private static void inputTriangle(int a, int b, int c) throws IllegalTriangleException {
        if ((a < 0 || b < 0 || c < 0) && (a + b <= c || a + c <= b || b + c <= a)) {
            throw new IllegalTriangleException("Đây là không phải tam giác");
        }
    }
}

