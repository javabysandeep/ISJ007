package controlStatements.conditionalStatements;

public class Demo9Switch {
    public static void main(String[] args) {
        int value = 10;
        switch (value) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
