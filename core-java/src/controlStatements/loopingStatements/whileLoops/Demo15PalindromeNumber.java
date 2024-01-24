package controlStatements.loopingStatements.whileLoops;

import java.util.Scanner;

public class Demo15PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
        System.out.println(originalNumber == reverse ? "Palindrome" : "not a palindrome");
    }
}
