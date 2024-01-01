public class SumOfDigits {

	public static void main(String[] args){
		
		int number = 123; 
		int digit = 0;
		int sum = 0;


		digit = number % 10 ; // --> 3
		sum = sum + digit; // 0 + 3 ---> 3
		number = number /10; // 123/10 ----> 12


		digit = number % 10; // 12 % 10 ---> 2
		sum = sum + digit; // 3 + 2 => 5
		number = number / 10; // 12 / 10 --> 1
		
		digit = number % 10; // 1 % 10 --> 1
		sum = sum + digit; // 5 + 1 --> 6
		number = number / 10; // 1 / 10 --> 0


		System.out.println("Sum of digits of 123 is : "+sum);

		
	


	}

}