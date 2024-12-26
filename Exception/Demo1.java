package syed;

public class Demo1 {
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}

	public static void main(String[] args) 
	{
		try
		{
			div();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		

	}

}
