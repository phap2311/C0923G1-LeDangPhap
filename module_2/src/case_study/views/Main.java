package case_study.views;

import case_study.util.ErrorException;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;


    public static void main(String[] args) {
        EmployeeView employeeView = new EmployeeView();
        CustomerView customerView = new CustomerView();
        FacilityView facilityView = new FacilityView();
        BookingView bookingView = new BookingView();
        PromotionView promotionView = new PromotionView();
        do {
            System.out.println("Furama hello");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit ");
            choice = ErrorException.checkChoice();

            switch (choice) {
                case 1:
                    employeeView.menuEmployee();
                    break;
                case 2:
                    customerView.menuCustomer();
                    break;
                case 3:
                    facilityView.menuFacility();
                    break;
                case 4:
                    bookingView.menuBooking();
                    break;
                case 5:
                    promotionView.menuPromotion();
                    break;
                case 6:
                    System.exit(0);
            }
        }
        while (true);
    }
}
