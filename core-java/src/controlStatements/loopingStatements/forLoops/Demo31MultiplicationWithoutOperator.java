package controlStatements.loopingStatements.forLoops;

import java.util.Scanner;

public class Demo31MultiplicationWithoutOperator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number1; i++) {
            result += number2;
        }
        System.out.println("Multiplication is " + result);
    }
}
