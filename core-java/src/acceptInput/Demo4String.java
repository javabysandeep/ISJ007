package acceptInput;

import java.util.Scanner;

public class Demo4String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string value");
        String stringValue = scanner.nextLine();
        System.out.println("You have entered :" + stringValue);
    }
}
