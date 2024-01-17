package controlStatements.loopingStatements.whileLoops;

public class Demo12SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int digit = 0;

        digit = number % 10;
        sum = sum + digit;
        number = number / 10;

        digit = number % 10;
        sum = sum + digit;
        number = number / 10;

        digit = number % 10;
        sum = sum + digit;
        number = number / 10;

        System.out.println("sum of digits " + sum);
    }
}
