package controlStatements.loopingStatements.patterns;

public class Demo5 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            //space
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            //stars
            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
