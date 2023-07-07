package src.controller;

import src.service.PromotionService;
import src.service.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionController {
    public void display() {
        PromotionService promotionService = new PromotionServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu Promotion Management ==========");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    promotionService.listCustomersUseService();
                    break;
                case 2:
                    promotionService.listCustomersGetVoucher();
                    break;
                case 3:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 3);
    }
}
