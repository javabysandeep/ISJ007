package controlStatements.conditionalStatements;

public class Demo10Switch {
    public static void main(String[] args) {
        int input = 1;
        switch (input) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
