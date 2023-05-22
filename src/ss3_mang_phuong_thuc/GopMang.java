package ss3_mang_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        do{
            System.out.print("Nhập độ dài mảng thứ 1: ");
            n1= Integer.parseInt(scanner.nextLine());
            if(n1<0){
                System.out.println("Giá trị nhập phải lớn hơn 0!");
            }
        }  while(n1<0);
        int[] arr1 = new int [n1];
        for(int i =0; i<n1; i++){
            System.out.format("a[%d] = ", i);
            arr1[i]=Integer.parseInt(scanner.nextLine());
        }
        do{
            System.out.print("Nhập độ dài mảng thứ 1: ");
            n2= Integer.parseInt(scanner.nextLine());
            if(n2<0){
                System.out.println("Giá trị nhập phải lớn hơn 0!");
            }
        }  while(n2<0);
        int[] arr2 = new int [n2];
        for(int i =0; i<n2; i++){
            System.out.format("a[%d] = ", i);
            arr2[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Xuất mảng thứ 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Xuất mảng thứ 2: ");
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int [arr1.length+arr2.length];
        int k = 0;
        for (int i =0; i<arr3.length; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }
            else {
                arr3[i]=arr2[k];
                k++;
            }
        }
        System.out.print("Xuất mảng thứ 3: ");
        System.out.println(Arrays.toString(arr3));
    }
}
