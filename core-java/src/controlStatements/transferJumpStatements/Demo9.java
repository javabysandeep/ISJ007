package controlStatements.transferJumpStatements;

public class Demo9 {
    public static void main(String[] args) {
        switch (1){
            case 1 : System.out.println("one"); return;
            case 2 : System.out.println("two"); return;
            case 3 : System.out.println("three"); return;
            case 4 : System.out.println("four"); return;
        }
        System.out.println("rest of the main");
    }
}
