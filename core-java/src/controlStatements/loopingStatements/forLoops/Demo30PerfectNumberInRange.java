package controlStatements.loopingStatements.forLoops;

public class Demo30PerfectNumberInRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 100000; number++) {
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    // System.out.println(i);
                    sumOfFactors = sumOfFactors + i;
                }
            }
            //  System.out.println("Sum of factors = " + sumOfFactors);
            if (sumOfFactors == number) {
                System.out.println("Its perfect number = " + number);
            }
        }
    }
}
