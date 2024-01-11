package controlStatements.loopingStatements;

import java.util.Scanner;

public class Demo17PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if it is perfect");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println(sumOfFactors == number ? "Perfect" : "not a perfect");
    }
}
