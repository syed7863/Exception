package syed;

public class ExampleForExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			
		
		System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index position");
		}
		catch(NullPointerException e)
		{
			System.out.println("Invalid");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid denominator");
		}
		catch(Exception e)
		{
			System.out.println("Superclass exception handler");
		}
	}

}
