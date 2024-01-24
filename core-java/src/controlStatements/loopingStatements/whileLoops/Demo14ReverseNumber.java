package controlStatements.loopingStatements.whileLoops;

import java.util.Scanner;

public class Demo14ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10  + digit;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
    }
}

// 123456
// 654321