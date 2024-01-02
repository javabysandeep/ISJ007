public class IncrementDecrementOperator {

	public static void main(String[] args){

		int a = 5;
		int b = ++a; // a=6, b=6
		int c = --b; // b = 5, c = 5
		int d = a++; //d=6, a=7
		int e = a--;//e = 7, a = 6

		System.out.println("a value = "+a);//6
		System.out.println("b value = "+b);//5
		System.out.println("c value = "+c);//5
		System.out.println("d value = "+d);//6
		System.out.println("e value = "+e);//7
		System.out.println(a + b + c + d + e);//29



	}

	
	
}