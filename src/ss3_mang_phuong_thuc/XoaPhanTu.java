package ss3_mang_phuong_thuc;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
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

        System.out.print("Nhập phần tử cần xóa: ");
        int deleteVal = Integer.parseInt(scanner.nextLine());
        int index=-1;
        for(int i =0; i<arr.length; i++){
            if(deleteVal==arr[i]){
                index=i;
            }
        }
        if(index==-1){
            System.out.println("Không tìm thấy phần tử cần xóa trong mảng!");
        }
        int[] arr2 = new int [arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != deleteVal) {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.print("Mảng sau khi xóa phần tử: ");
        System.out.println(Arrays.toString(arr2));

    }
}
