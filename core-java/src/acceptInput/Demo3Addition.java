package acceptInput;

import java.util.Scanner;

public class Demo3Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for addition");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Addition is " + (number1 + number2));
    }
}
