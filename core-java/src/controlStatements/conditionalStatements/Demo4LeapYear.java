package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo4LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 100) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println("its a leap year");
        } else {
            System.out.println("its not a leap year");
        }
    }
}
