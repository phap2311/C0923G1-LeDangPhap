package ss12_java_collection_framework.bai2.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chào mừng bạn");
        ProductView productView = new ProductView();
        int choice;
        do{
            System.out.println("1.Quản lý sản phẩm");;
            System.out.println("2.Quản lý nhân viên");
            System.out.println("0.Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productView.menuProrduct();
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice!=0);
    }
}
