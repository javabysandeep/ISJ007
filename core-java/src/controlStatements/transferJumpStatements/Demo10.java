package controlStatements.transferJumpStatements;

public class Demo10 {
    public static void main(String[] args) {
        switch (4){
            case 1 : System.out.println("one"); break;
            case 2 : System.out.println("two"); break;
            case 3 : System.out.println("three"); break;
            case 4 : System.out.println("four"); return;
        }
        System.out.println("Rest of the main");
    }
}
