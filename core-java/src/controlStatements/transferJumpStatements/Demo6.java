package controlStatements.transferJumpStatements;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            if (i % 11 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Rest of the main");
    }
}
