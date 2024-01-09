package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo6Trip {
    public static void main(String[] args) {
        System.out.println("Enter your budget");
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        if (budget >= 50000) {
            System.out.println("Visit Goa");
        } else {
            System.out.println("Stay Home Stay Safe");
        }
    }
}
