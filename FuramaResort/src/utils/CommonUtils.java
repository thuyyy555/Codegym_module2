package src.utils;


import src.model.Customer;
import src.service.CustomerService;
import src.service.CustomerServiceImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtils {
    static Scanner scanner = new Scanner(System.in);
    static CustomerService customerService = new CustomerServiceImpl();
    public static boolean isPhoneNumber(String number){
        String phoneNumberRegex =   "^(0\\d{9})$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
    public static String checkPhoneNumber(String number){
        while (!isPhoneNumber(number) || checkValidNumber(number)) {
            System.out.println("Định dạng không hợp lệ hoặc sđt đã tồn tại! Vui lòng nhập lại!");
            System.out.print("Nhập giá trị: ");
            number = scanner.nextLine();
        }
        return number;
    }
    public static boolean checkValidNumber(String number){
        boolean flag = false;
        for(Customer customer: customerService.getList()){
            if(Objects.equals(customer.getSdt(), number)){
                flag = true;
            }
        }
        return flag;
    }
    public static boolean isValidDateFormat(String inputDate) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate.parse(inputDate, dateFormatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static LocalDate getDate(String date){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (!isValidDateFormat(date)) {
            System.out.println("Định dạng không hợp lệ! Vui lòng nhập lại!");
            System.out.print("Nhập giá trị: ");
            date = scanner.nextLine();
        }
        return LocalDate.parse(date, dateFormatter);
    }

//    public static void isEmty() {
//
//    }

//
//    public static void checkIntegerValue(String number) {
//        if (!number.matches("[0-9]+")) {
//            System.out.println("Invalid value");
//        }
//    }

//    public static void checkStringValue(String name) {
//        if (!name.matches("[a-zA-Z_]+")) {
//            System.out.println("Invalid value");
//        }
//}

//    public static String inputWithOutEmpty(String prompt){
//        String temp = null;
//        do{
//            System.out.println("Please enter value!!! ");
//        }while(true)
//    }

//    public static Double typeDouble(String prompt) {
//        String temp = inputWithOutEmpty(prompt);
//        while (!isNumeric(temp)) {
//            System.out.println("Invalid value !!! ");
//            temp = inputWithOutEmpty("Enter again: ");
//        }
//        return Double.parseDouble(temp);
//    }

//    public static boolean isNumeric(String string) {
//        String regex = "[0-9]+[\\.]?[0-9]*";
//        return Pattern.matches(regex, string);
//    }

}
