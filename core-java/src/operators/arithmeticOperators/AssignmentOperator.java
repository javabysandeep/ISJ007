package operators.arithmeticOperators;

public class AssignmentOperator {

	public static void main(String[] args){

		int a = 100;

		System.out.println(a==299);
		
		System.out.println(a=299);

          	//System.out.println(299 = 10);//CTE

          	System.out.println(299 == 10);//false

		int b = a ;
		System.out.println("b value is "+b);


		int c = 10 * 2 + b ;
		System.out.println("C value is "+c);

		int d = square(19) ;
		System.out.println("D value is "+d);



	}

	
	public static int square(int number){

		return number * number;
	}

	

}