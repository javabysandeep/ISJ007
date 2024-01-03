package operators;

public class BitwiseOperators1 {
    public static void main(String[] args) {
        //System.out.println(4 && 5);//CTE
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(~4);//-5 --> add one and change the sign
        System.out.println(~5);//-6 --> add one and change the sign
        System.out.println(~6);//-7 --> add one and change the sign
        System.out.println(~7);//-8 --> add one and change the sign
        System.out.println(~-7);//6 --> add one and change the sign

        // left shift = number * 2^power
        // 4 * 2^1 --> 8
        // 4 * 2^2 --> 16
        // 4 * 2^3 --> 32
        System.out.println("left shift operator");
        System.out.println(4 << 1);//shift the bits of 4 to the left by one places --> 8
        System.out.println(4 << 2);//shift the bits of 4 to the left by two places --> 16
        System.out.println(4 << 3);//shift the bits of 4 to the left by three places --> 32 // left shift = number * 2^power


        // right shift operator --> number / 2^power
        // 4 / 2^1 --> 2
        // 4 / 2^2 --> 1
        // 4 / 2^3 --> 0
        System.out.println("right shift operator");
        System.out.println(4 >> 1);//shift the bits of 4 to the right by one places --> 2
        System.out.println(4 >> 2);//shift the bits of 4 to the right by two places --> 1
        System.out.println(4 >> 3);//shift the bits of 4 to the right by three places --> 0
    }
}
