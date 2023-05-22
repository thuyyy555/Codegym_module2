package ss3_mang_phuong_thuc;

import java.util.Scanner;

public class PhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập độ dài mảng: ");
            n= Integer.parseInt(scanner.nextLine());
            if(n<0){
                System.out.println("Giá trị nhập phải lớn hơn 0!");
            }
        }  while(n<0);
        int[] arr = new int[n];
        for(int i =0; i<arr.length; i++){
            System.out.printf("a[%d] = ", i);
            arr[i]= Integer.parseInt(scanner.nextLine());
        }
        int smallestVal= arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]<smallestVal){
                smallestVal=arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất: " + smallestVal);

    }
}
