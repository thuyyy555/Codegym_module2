package ss3_mang_phuong_thuc;

import java.util.Scanner;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do{
            System.out.print("Nhập vào số dòng của mảng: ");
            row = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập vào số cột của mảng: ");
            col = Integer.parseInt(scanner.nextLine());
        } while(col < 0 && row < 0);
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.format("a[%d][%d] = ", i, j);
                arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<=arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}

