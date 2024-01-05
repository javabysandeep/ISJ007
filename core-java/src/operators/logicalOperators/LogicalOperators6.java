package operators.logicalOperators;

public class LogicalOperators6 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        System.out.println("Is Number 1 max : " + (number1 > number2 && number1 > number3));//false
        System.out.println("Is Number 2 max : " + (number2 > number1 && number2 > number3));//false
        System.out.println("Is Number 3 max : " + (number3 > number1 && number3 > number2));//true
    }
}
