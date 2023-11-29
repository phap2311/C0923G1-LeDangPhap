package case_study.views;

import case_study.controller.PromotionController;

import java.util.Scanner;

public class PromotionView {
    private PromotionController promotionController = new PromotionController();
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    public void menuPromotion() {
        do {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
            }
        }
        while (true);
    }
}
