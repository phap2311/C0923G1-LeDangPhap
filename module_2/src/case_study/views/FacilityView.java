package case_study.views;

import case_study.controller.FacilityController;

import java.util.Scanner;

public class FacilityView {
    private FacilityController facilityController = new FacilityController();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;

    public void menuFacility() {
        do {
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility mainternance");
            System.out.println("4.Delete facility");
            System.out.println("5.Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

            }
        }
        while (true);
    }
}
