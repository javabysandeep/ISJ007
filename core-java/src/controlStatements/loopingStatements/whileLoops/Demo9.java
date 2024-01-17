package controlStatements.loopingStatements.whileLoops;

public class Demo9 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
        }
        //o/p : finite
        // 0 10
        // 1 10
        // 2 10
        // 3 10
        // ....
        // 9 10
    }
}
