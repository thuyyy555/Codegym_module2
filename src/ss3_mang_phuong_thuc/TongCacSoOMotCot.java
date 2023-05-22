package ss3_mang_phuong_thuc;

import java.util.Scanner;

public class TongCacSoOMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int colNumber, i=0, j=0;
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
            if(j<=0){
                System.out.println("Số cột phải lớn hơn 0!");
            }
        }while(j<=0);
        int[][] arr = new int[i][j];
        for(int m =0; m<arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.printf("arr[%d][%d] = ", m, n);
                arr[m][n]=Integer.parseInt(scanner.nextLine());
            }
        }
        do{
            System.out.print("Nhập cột muốn tính tổng: ");
            colNumber=Integer.parseInt(scanner.nextLine());
        }while(colNumber>=j||colNumber<0);
        for(int row =0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(col==colNumber){
                    sum+=arr[row][col];
                };
            }
        }
        System.out.printf("Tổng của cột thứ %d là: %d", colNumber, sum);
    }
}
