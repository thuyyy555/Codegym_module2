package src.controller;

import src.service.BookingService;
import src.service.BookingServiceImpl;
import src.service.ContractService;
import src.service.ContractServiceImpl;

import java.util.Scanner;

public class BookingController {
    public void display() {
        BookingService bookingService = new BookingServiceImpl();
        ContractService contractService = new ContractServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu Booking Management ==========");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contract");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    contractService.createNewContract();
                    break;
                case 4:
                    contractService.displayListContract();
                    break;
                case 5:
                    contractService.editContract();
                    break;
                case 6:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 6);
    }
}
