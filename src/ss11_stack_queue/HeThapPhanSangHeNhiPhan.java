package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class HeThapPhanSangHeNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhap so muon chuyen doi: ");
        int n = Integer.parseInt(scanner.nextLine());
        while(n!=0){
            stack.push(n%2);
            n/=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
