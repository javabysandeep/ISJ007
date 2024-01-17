package controlStatements.loopingStatements.forLoops;

import java.util.Scanner;

public class Demo11Table {
    public static void main(String[] args) {
        System.out.println("Enter a number to find the table");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
