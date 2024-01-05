package operators.conditionalOperator;

public class Demo4MaxOfTwoNumbers {
    public static void main(String[] args) {
        int number1 = 84;
        int number2 = 94;
        System.out.println("Max = " + (number1 > number2 ? number1 : number2));
        System.out.println("Min = " + (number1 < number2 ? number1 : number2));
    }
}
