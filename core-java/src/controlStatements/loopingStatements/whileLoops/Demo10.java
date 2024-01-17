package controlStatements.loopingStatements.whileLoops;

public class Demo10 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left + "\t" + right);
            right--;
        }
        //o/p : finite
        // 0 10
        // 0 9
        // 0 8
        // 0 7
        //..
        //0 1
    }
}
