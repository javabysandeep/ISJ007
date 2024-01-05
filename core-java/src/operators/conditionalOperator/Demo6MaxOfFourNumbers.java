package operators.conditionalOperator;

public class Demo6MaxOfFourNumbers {
    public static void main(String[] args) {
        int number1 = 284;
        int number2 = 194;
        int number3 = 594;
        int number4 = 294;

        int maximumNumber = number1 > number2 && number1 > number3 && number1 > number4 ? number1
                : number2 > number1 && number2 > number3 && number2 > number4 ? number2
                : number3 > number1 && number3 > number2 && number3 > number4 ? number3
                : number4;
        System.out.println("Max of four numbers is " + maximumNumber);


    }
}
