package controlStatements.loopingStatements.patterns;

public class Demo10 {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.println(originalNumber == sum ? "armstrong" : "not an armstrong number");
    }
}
