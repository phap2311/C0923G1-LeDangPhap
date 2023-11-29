package case_study.views;

import case_study.controller.CustomerController;

import java.util.Scanner;

public class CustomerView {
    private CustomerController customerController = new CustomerController();
    private Scanner scanner = new Scanner(System.in);
    private static int choice;
    public void menuCustomer() {
        do {
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Delete customer");
            System.out.println("5.Search by name customer");
            System.out.println("6.Return main");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

            }
        }
        while (true);
    }
}
