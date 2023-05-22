package ss1_introduction_java.exercise;

import java.util.Scanner;

public class DocSoThanhChu {
    static String result = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào một số n: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 999 || number < 0) {
                System.out.println("Giá trị nhập vào không hợp lệ vui lòng nhập lại!");
            }
        }while(number > 999 || number < 0);
        if (number <= 10) {
            ZeroToTen(number);
            System.out.println(result);
        }
        if (number > 10 && number < 20) {
            ElevenToNineTeen(number);
            System.out.println(result);
        }
        if (number >= 20 && number < 100) {
            if(number%10==0){
                int tens = number / 10;
                TwentyToNineTy(tens);
                System.out.println(result);
            }
            else {
                int tens = number / 10;
                TwentyToNineTy(tens);
                System.out.print(result);
                int one = number % 10;
                ZeroToTen(one);
                System.out.println(result);
            }
        }
        if (number >= 100 && number <= 999) {
            int hun = number / 100;
            HundredToNineHunderedninetynine(hun);
            System.out.print(result);
            int ten = number % 100;
            if (ten >= 1 && ten <= 10) {
                ZeroToTen(ten);
                System.out.print(" and " + result);
            }
            if (ten > 10 && ten <= 20) {
                ElevenToNineTeen(ten);
                System.out.print(" and " + result);
            }
            if (ten > 20 && ten < 100) {
                if(ten%10==0){
                    int tens = ten / 10;
                    TwentyToNineTy(tens);
                    System.out.print(" and " + result);

                }
                else {
                    int tens = ten / 10;
                    TwentyToNineTy(tens);
                    System.out.print(" and " + result);
                    int one = ten % 10;
                    ZeroToTen(one);
                    System.out.println(result);
                }

            }
        }
    }
    public static void ZeroToTen(int n) {
        switch (n) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
        }
    }
    public static void ElevenToNineTeen(int n) {
        switch (n) {
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eightteen";
                break;
            case 19:
                result = "nineteen";
                break;
        }
    }
    public static void TwentyToNineTy(int n) {
        switch (n) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;
            case 4:
                result = "fourty";
                break;
            case 5:
                result = "fifty";
                break;
            case 6:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 8:
                result = "eighty";
                break;
            case 9:
                result = "ninety";
                break;
        }
    }
    public static void HundredToNineHunderedninetynine(int n) {
        switch (n) {
            case 1:
                result = "one hundred";
                break;
            case 2:
                result = "two hundred";
                break;
            case 3:
                result = "three hundred";
                break;
            case 4:
                result = "four hundred";
                break;
            case 5:
                result = "five hundred";
                break;
            case 6:
                result = "six hundred";
                break;
            case 7:
                result = "seven hundred";
                break;
            case 8:
                result = "eight hundred";
                break;
            case 9:
                result = "nine hundred";
                break;
        }
    }

}
