package controlStatements.loopingStatements.forLoops;

public class Demo27Pattern {
    public static void main(String[] args) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         * */

        for (int row = 5; row >= 1; row--) {

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
