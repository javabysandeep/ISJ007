package acceptInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the byte value");
        byte byteValue = scanner.nextByte();
        System.out.println("You have entered byte value " + byteValue);

        System.out.println("Enter the short value");
        short shortValue = scanner.nextShort();
        System.out.println("You have entered short value " + shortValue);
    }
}
