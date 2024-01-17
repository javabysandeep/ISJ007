package controlStatements.loopingStatements.forLoops;

public class Demo6 {
    public static void main(String[] args) {
        for (int left = 0, right = 5; left < right; left++, right--) {
            System.out.println(left + "\t" + right);
        }
    }
    //0 5
    //1 4
    //2 3
}
