package operators;

public class LogicalOperator5 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 1 && 10 % 0 == 0);//false
        System.out.println(10 % 2 == 0 || 10 % 0 == 0);//true
    }
}
