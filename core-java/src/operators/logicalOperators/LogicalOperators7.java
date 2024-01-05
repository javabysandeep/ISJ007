package operators.logicalOperators;

public class LogicalOperators7 {
    public static void main(String[] args) {
        int number = 120;
        boolean isDivisible = number % 1 == 0 && number % 2 == 0 && number % 3 == 0 && number % 4 == 0 && number % 5 == 0;
        System.out.println(number + " is divisible by 1,2,3,4,5 = " + isDivisible);
    }
}
