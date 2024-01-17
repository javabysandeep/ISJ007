package controlStatements.loopingStatements.forLoops;

public class Demo28Pattern {
    public static void main(String[] args) {
        /*
           * * * * *
             * * * *
               * * *
                * *
                  *
         * */

        for (int row = 5; row >= 1; row--) {
            for (int space = row - 1; space <=5 ; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
