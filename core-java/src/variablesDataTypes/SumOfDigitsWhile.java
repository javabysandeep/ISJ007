package variablesDataTypes;

public class SumOfDigitsWhile {

	public static void main(String[] args){
		
		int number = 123456789; 
		int digit = 0;
		int sum = 0;

		while(number > 0){
			digit = number % 10 ; 
			sum = sum + digit; 
			number = number /10;
		}
		System.out.println("Sum of digits is : "+sum);


	}

}