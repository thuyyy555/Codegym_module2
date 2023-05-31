package ss9_mvc.view;

import ss9_mvc.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }
}
