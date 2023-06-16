package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra: ");
        String string = scanner.nextLine().toLowerCase();
        Stack<String> stack = new Stack<>();
        String[] words = string.split("\\s");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                stack.push(Character.toString(words[i].charAt(j)));
            }
        }
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                queue.add(Character.toString(words[i].charAt(j)));
            }
        }
        String output1 = "";
        while (!stack.isEmpty()) {
            output1 += stack.pop();
        }
        String output2 = "";
        while (!queue.isEmpty()) {
            output2 += queue.poll();
        }
        if (output1.equals(output2)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }

    }
}
