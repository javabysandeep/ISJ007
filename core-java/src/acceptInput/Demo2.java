package acceptInput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the boolean value");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You have entered boolean value " + booleanValue);
    }
}
