package controlStatements.loopingStatements.whileLoops;

public class Demo6 {
    public static void main(String[] args) {
       int i= 0;
        while (i < 10){
            System.out.println(i);
            i--;
        }
        //o/p : infinite loop : 0, -1, -2 ........
    }
}
