package syed;

public class ExampleForFinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Superclass exception handler");
		}
		finally
		{
			System.out.println("Inside the finally block");
		}
		
		

	}

}
