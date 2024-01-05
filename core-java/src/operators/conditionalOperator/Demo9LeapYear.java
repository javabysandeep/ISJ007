package operators.conditionalOperator;

public class Demo9LeapYear {
    public static void main(String[] args) {
        // leap year : year must be divisible by 4
        // and if it is century then it must be divisible by 400
        int year = 1900;
        boolean isLeapYear = (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);
        System.out.println(isLeapYear ? "Its leap year" : "its not a leap year");
    }
}
