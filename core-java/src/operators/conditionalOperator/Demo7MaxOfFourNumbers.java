package operators.conditionalOperator;

public class Demo7MaxOfFourNumbers {
    public static void main(String[] args) {
        int number1 = 284;
        int number2 = 594;
        int number3 = 594;
        int number4 = 594;

        int max = -211418;
        max = max < number1 ? max = number1 : max;
        max = max < number2 ? max = number2 : max;
        max = max < number3 ? max = number3 : max;
        max = max < number4 ? max = number4 : max;
        System.out.println("Max of 4 is = " + max);


    }
}
