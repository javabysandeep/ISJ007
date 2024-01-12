package controlStatements.loopingStatements;

public class Demo24Pattern {
    public static void main(String[] args) {
        /*
                    *
                  * *
                * * *
              * * * *
            * * * * *

         * */

        for (int row = 1; row <=5 ; row++) {
            for (int space = 5-row; space >=1 ; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
