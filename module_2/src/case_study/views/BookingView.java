package case_study.views;

import case_study.controller.BookingController;

import java.util.Scanner;

public class BookingView {
    private static  Scanner scanner = new Scanner(System.in);
    private static int choice;
    private BookingController bookingController = new BookingController();
    public void menuBooking() {
        do {
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

            }
        }
        while (true);
    }
}
