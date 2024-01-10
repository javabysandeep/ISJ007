package controlStatements.loopingStatements;

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find its factor");
        int number = scanner.nextInt();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("its factor " + i);
            }
        }
    }
}
