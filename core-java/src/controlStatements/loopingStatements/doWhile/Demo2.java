package controlStatements.loopingStatements.doWhile;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);
        do {
            System.out.println("You have entered " + ch);
            System.out.println("do you want to continue");
            ch = scanner.next().charAt(0);
        } while (ch != 'x');


    }
}
