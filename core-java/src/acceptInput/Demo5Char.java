package acceptInput;

import java.util.Scanner;

public class Demo5Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character value");
        String word = scanner.next();
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);
        System.out.println("You have entered :" + ch1);
        System.out.println("You have entered :" + ch2);
    }
}
