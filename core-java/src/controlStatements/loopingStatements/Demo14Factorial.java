package controlStatements.loopingStatements;

import java.util.Scanner;

public class Demo14Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find factorial");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);
    }
}
