package src.controller;

import src.service.FacilityService;
import src.service.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityController {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService = new FacilityServiceImpl();
        NewFacilityController newFacilityController = new NewFacilityController();
        int choose;
        do {
            System.out.println("========== Menu Facility Management ==========");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityService.displayListFacility();
                    break;
                case 2:
                    newFacilityController.display();
                    break;
                case 3:
                    facilityService.displayListMaintenanceFacity();
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    }
}
