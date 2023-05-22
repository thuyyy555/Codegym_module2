package ss2_vong_lap;
import java.util.Scanner;
public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------Menu-------------------------------------");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    int length, width;
                    do {
                        System.out.print("Nhập vào chiều rộng: ");
                        width = Integer.parseInt(scanner.nextLine());
                        if (width < 0) {
                            System.out.println("Giá trị phải lớn hơn 0!");
                        }
                    } while (width < 0);
                    do {
                        System.out.print("Nhập vào chiều dài: ");
                        length = Integer.parseInt(scanner.nextLine());
                        if (length < 0) {
                            System.out.println("Giá trị phải lớn hơn 0!");
                        }
                    } while (length < 0);
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    int n;
                    do {
                        System.out.print("Nhập vào chiều cao tam giác ");
                        n = Integer.parseInt(scanner.nextLine());
                        if (n < 0) {
                            System.out.println("Giá trị phải lớn hơn 0!");
                        }
                    } while (n < 0);
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = n; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int height;
                    do {
                        System.out.print("Nhập vào chiều cao tam giác cân ");
                        height = Integer.parseInt(scanner.nextLine());
                        if (height < 0) {
                            System.out.println("Giá trị phải lớn hơn 0!");
                        }
                    } while (height < 0);
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
