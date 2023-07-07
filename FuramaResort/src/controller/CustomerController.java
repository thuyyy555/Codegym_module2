package src.controller;

import src.service.CustomerService;
import src.service.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerController {
    public void display() {
        CustomerService customerService = new CustomerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu Customer Management ==========");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.create();
                    break;
                case 3:
                    customerService.update();
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    }
}
