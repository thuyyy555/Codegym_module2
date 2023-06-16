package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElements {
    public static void reverseNumbers() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Truoc: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            stack.push(arr[i]);
        }
        int j = 0;
        System.out.println("Sau: ");
        while (!stack.isEmpty()) {
            arr2[j] = stack.pop();
            System.out.println("arr2[" + j + "] = " + arr2[j]);
            ++j;
        }
    }

    public static void reverseString() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String string = scanner.nextLine();
        String[] words = string.split("\\s");
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
        int j = 0;
        String output = "";
        while (!stack.isEmpty()) {
            words[j] = stack.pop();
            output += words[j] + " ";
            ++j;
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        reverseNumbers();
        reverseString();
    }

}
