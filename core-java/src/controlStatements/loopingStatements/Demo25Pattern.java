package controlStatements.loopingStatements;

public class Demo25Pattern {
    public static void main(String[] args) {
         /*
                 1
                 0 0
                 1 1 1
                 0 0 0 0
                 1 1 1 1 1
         * */

        for (int row = 1; row <=5 ; row++) {

            for (int column = 1; column <=row ; column++) {
                System.out.print(row%2==0?"0 ":"1 ");
            }
            System.out.println();
        }

    }
}
