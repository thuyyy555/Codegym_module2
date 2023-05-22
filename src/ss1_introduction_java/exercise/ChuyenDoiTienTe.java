package ss1_introduction_java.exercise;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double VND = 23.000;
        System.out.print("Nhập USD: ");
        double USD = Double.parseDouble(scanner.nextLine());
        double money = USD * VND;
        System.out.println("Giá trị sau khi chuyển sang VND: " + money);
    }
}
