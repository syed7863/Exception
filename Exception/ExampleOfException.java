package syed;
import java.util.Scanner;

public class ExampleOfException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("Enter the value of number1");
		int num1=sc.nextInt();
		
		System.out.println("Enter the value of Denominator");
		int num2=sc.nextInt();
	     try
	     {
		
		System.out.println(num1/num2);
	     }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println("Dabba fellow, we cant divide by zero");
	     }
	}

}
