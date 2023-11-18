package ss12_java_collection_framework.bai_them.view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lý phương tiện giao thông");
        VehicleView vehicleView = new VehicleView();

        int choice;
        do {
            System.out.println("1. xe oto");
            System.out.println("2. xe tải");
            System.out.println("3. xe máy");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleView.menuVehicle();
                    break;
            }

        }
        while (choice != 0);
    }
}
