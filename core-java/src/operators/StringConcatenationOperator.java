package operators;

public class StringConcatenationOperator {

	public static void main(String[] args){
		
		System.out.println("Hello"+10+20+30); //Hello102030

		System.out.println(10+20+30 +"Hello"); //60Hello


		System.out.println('A'+"A"+'A'+"A"); //AAAA


		System.out.println('A'+'A'+"A"+"A"); //130AA

	}

}