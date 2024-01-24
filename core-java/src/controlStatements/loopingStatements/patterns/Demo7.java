package controlStatements.loopingStatements.patterns;

public class Demo7 {
    public static void main(String[] args) {
        for (int row = 7; row >= 1; row = row - 2) {
            for (int space = 1; space <= 7 - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(column % 2 == 0 ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}
