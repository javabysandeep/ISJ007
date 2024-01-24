package controlStatements.transferJumpStatements;

public class Demo1 {
    public static void main(String[] args) {
        //jump statements : break, continue, return

        // break must be used inside the loops or switch otherwise we get CTE

        // break statement execution means end of loop or switch

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");

    }
}
