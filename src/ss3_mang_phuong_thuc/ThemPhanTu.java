package ss3_mang_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
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
        int[] arr = new int [n];
        for(int i =0; i<n; i++){
            System.out.format("a[%d] = ", i);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Xuất mảng: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Nhập phần tử cần chèn: ");
        int insertVal = Integer.parseInt(scanner.nextLine());
        int index;
        do{
            System.out.print("Nhập vị trí cần chèn: ");
            index = Integer.parseInt(scanner.nextLine());
            if(index>= arr.length||index<0){
                System.out.println("Không tìm thấy vị trí cần chèn trong mảng!");
            }
        }while(index>=arr.length||index<0);
        int[] arr2 = new int [arr.length+1];
//        arr2[index]=insertVal;
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(i!=index) {
                arr2[i] = arr[j];
                j++;
            }
            else {
                arr2[index]=insertVal;
            }
        }
        System.out.print("Mảng sau khi chèn phần tử: ");
        System.out.println(Arrays.toString(arr2));

    }
}

