package ss3_mang_phuong_thuc;

import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str="Xin chao ban!";
        System.out.print("Nhập 1 kí tự: ");
        char character = scanner.next().charAt(0);
        int count =0;
        for(int i =0; i<str.length(); i++){
            char a = str.charAt(i);
            if(character == str.charAt(i)){
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện của kí tự %c là: %d", character, count);
    }
}
