package controlStatements.loopingStatements;

public class Demo13EvenSumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of even 1 to 100 numbers is " + sum);
    }
}
