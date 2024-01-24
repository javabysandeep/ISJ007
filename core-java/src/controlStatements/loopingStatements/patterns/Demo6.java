package controlStatements.loopingStatements.patterns;

public class Demo6 {
    public static void main(String[] args) {
        //first upper triangle
        for (int row = 1; row <= 5; row++) {
            //space
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            //stars
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower triangle
        for (int row = 4; row >= 1; row--) {
            //space
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
