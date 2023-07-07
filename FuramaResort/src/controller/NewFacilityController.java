package src.controller;

import src.service.FacilityService;
import src.service.FacilityServiceImpl;

import java.util.Scanner;

public class NewFacilityController {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        FacilityService facilityService = new FacilityServiceImpl();
        int choose;
        do {
            System.out.println("========== Add New Facility ==========");
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityService.createNewVilla();
                    break;
                case 2:
                    facilityService.createNewHouse();
                    break;
                case 3:
                    facilityService.createNewRoom();
                    break;
                case 4:
                    FacilityController facilityController = new FacilityController();
                    facilityController.display();
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    }
}
