package controlStatements.transferJumpStatements;

public class Demo3 {
    public static void main(String[] args) {
        //jump statements : break, continue, return

        // break must be used inside the loops or switch otherwise we get CTE

        // break statement execution means end of loop or switch

        do {
            System.out.println("do while body");
            break;
        }while (true);
        System.out.println("rest of the main");

    }
}
