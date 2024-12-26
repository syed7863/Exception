package syed;
class InvalidPasswordException extends RuntimeException
{
	
}

public class LoginForm {

	public static void main(String[] args) {
		
		String id = "Admin";
		int password = 12345;
		
		if(id.equals("Admin"))
		{
			if(password ==123)
			{
				System.out.println("Login Successfull");
			}
			else
			{
				try
				{
				InvalidPasswordException obj = new InvalidPasswordException();
				throw obj;
				}
				catch(InvalidPasswordException e)
				{
					System.out.println("Invalid Password Entered");
				}
			}
		}
		

	}

}
