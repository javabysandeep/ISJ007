package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo11Switch {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("invalid input");
        }
    }

    private static int function() {
        return 1;
    }
}
