package ss2_vong_lap;

import java.util.Scanner;

public class HienThi20SNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập số lượng số nguyên tố cần in: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) {
                System.out.println("Giá trị nhập vào phải lớn hơn 0!");
            }
        }
        while (number <= 0);
        int count = 0;
        int N = 2;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
