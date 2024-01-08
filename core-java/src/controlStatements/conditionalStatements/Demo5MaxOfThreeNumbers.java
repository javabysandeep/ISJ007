package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo5MaxOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("max is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("max is " + number2);
        } else {
            System.out.println("max is " + number3);
        }

    }
}
