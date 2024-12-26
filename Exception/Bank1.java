package syed;

import java.util.Scanner;
class InvalidAmountException extends RuntimeException{
}
	public class Bank1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Amount");
	int Amount =s.nextInt();
	if(Amount<=2000 & Amount>=1)
	{
		System.out.println("You successfully withdraw the rupees Rs=" + Amount);
	}
	else {
		try {
			InvalidAmountException amt = new InvalidAmountException();
			throw amt;		
		}
		catch(InvalidAmountException e)
		{
			System.out.println("Insufficient Balance your balance is Rs=2000");
		}
	}
	}
	}