package controlStatements.loopingStatements.forLoops;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "its prime" : "its not a prime number");
    }
}
