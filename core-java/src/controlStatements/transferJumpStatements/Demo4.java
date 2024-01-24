package controlStatements.transferJumpStatements;

public class Demo4 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (true) {
            System.out.println(left + "\t" + right);
            left = left + 2;
            right++;
            if (left == right) {
                break;
            }
        }
        //break executes means end of loop or switch and not end of method
        System.out.println("rest of main");
    }
}
