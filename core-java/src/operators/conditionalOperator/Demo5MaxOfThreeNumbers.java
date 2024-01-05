package operators.conditionalOperator;

public class Demo5MaxOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 284;
        int number2 = 194;
        int number3 = 594;
        System.out.println("Max = " +

                (number1 > number2 && number1 > number3 ? number1 : number2 > number1 && number2 > number3 ? number2 : number3)

        );

    }
}
