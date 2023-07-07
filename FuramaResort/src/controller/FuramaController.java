package src.controller;

import java.util.Scanner;

public class FuramaController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        do {
//            while (true)
//            try{
            System.out.println("========== Menu ==========");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeController employeeController = new EmployeeController();
                    employeeController.display();
                    break;
                case 2:
                    CustomerController customerController = new CustomerController();
                    customerController.display();
                    break;
                case 3:
                    FacilityController facilityController = new FacilityController();
                    facilityController.display();
                    break;
                case 4:
                    BookingController bookingController = new BookingController();
                    bookingController.display();
                    break;
                case 5:
                    PromotionController promotionController = new PromotionController();
                    promotionController.display();
                    break;
            }
//            }catch(NumberFormatException e){
//                System.out.println("Please enter number!!!");
//            }
        } while (choose >= 1 && choose <= 5);
    }
}




