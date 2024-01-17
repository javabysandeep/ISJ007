package controlStatements.loopingStatements.forLoops;

public class Demo29PrimeNumbersInRange {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 1; number <= 10000; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println("prime number : " + number);
            }
        }
        System.out.println("Total number of prime numbers in range of 1 to 10000 = " + count);
    }
}
