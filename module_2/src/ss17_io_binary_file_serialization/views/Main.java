package ss17_io_binary_file_serialization.views;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductView productView = new ProductView();
        int choice ;
        do {
            System.out.println("1.Quản lý sản phẩm");
            System.out.println("2.Quản lý nhân viên");
            System.out.println("0.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productView.menuProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập đúng");
            }
        }while (true);
    }
}
