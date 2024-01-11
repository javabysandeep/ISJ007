package controlStatements.loopingStatements;

import java.util.Scanner;

public class Demo18PerfectNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 10000; number++) {
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors == number) {
                System.out.println("perfect number " + number);
            }
        }
    }
}
