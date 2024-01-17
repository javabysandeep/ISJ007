package controlStatements.loopingStatements.whileLoops;

public class Demo13SumOfDigitsUsingLoop {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("sum of digits " + sum);
    }
}
