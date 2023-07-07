package src.controller;

import src.service.EmployeeService;
import src.service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    public void display() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("========== Menu Employee Management ==========");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.create();
                    break;
                case 3:
                    employeeService.update();
                    break;
                case 4:
                    FuramaController furamaController = new FuramaController();
                    furamaController.displayMenu();
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    }
}
