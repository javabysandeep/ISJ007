package controlStatements.transferJumpStatements;

public class Demo2 {
    public static void main(String[] args) {
        //jump statements : break, continue, return

        // break must be used inside the loops or switch otherwise we get CTE

        // break statement execution means end of loop or switch

        while (true) {
            System.out.println("while body");
            break;
        }
        System.out.println("rest of the main");

    }
}
