package ss3_mang_phuong_thuc;

import java.util.Scanner;

public class DuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0, j=0;
        int sum=0;
        do{
            System.out.print("Nhập vào số hàng của mảng: ");
            i=Integer.parseInt(scanner.nextLine());
            if(i<=0){
                System.out.println("Số hàng phải lớn hơn 0!");
            }
        }while(i<=0);
        do{
            System.out.print("Nhập vào số cột của mảng: ");
            j=Integer.parseInt(scanner.nextLine());
            if(j<=0||j!=i){
                System.out.println("Số cột phải lớn hơn 0 và bằng số hàng!");
            }
        }while(j<=0||j!=i);
        int[][] arr = new int[i][j];
        for(int m =0; m<arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.printf("arr[%d][%d] = ", m, n);
                arr[m][n]=Integer.parseInt(scanner.nextLine());
            }
        }
        for(int row =0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(row==col){
                    sum+=arr[row][col];
                };
            }
        }
        System.out.println("Tổng các phần tử ở đường chéo chính của ma trận vuông: " + sum);
    }
}
