package syed;
//Custom exception class
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//BankAccount class
class BankAccount {
 private double balance;

 // Constructor to initialize the account with a balance
 public BankAccount(double balance) {
     this.balance = balance;
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance. Available balance: " + balance);
     }
     balance -= amount;
     System.out.println("Withdrawal successful. Remaining balance: " + balance);
 }

 // Method to check the current balance
 public double getBalance() {
     return balance;
 }
}

//Main class
public class Bank {
 public static void main(String[] args) {
     BankAccount account = new BankAccount(5000); // Create an account with an initial balance

     try {
         System.out.println("Attempting to withdraw 2000...");
         account.withdraw(2000); // Successful withdrawal

         System.out.println("Attempting to withdraw 4000...");
         account.withdraw(4000); // Throws InsufficientBalanceException
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage()); // Handle the exception
     }

     System.out.println("Final balance: " + account.getBalance());
 }
}


