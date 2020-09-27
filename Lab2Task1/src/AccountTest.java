import java.util.Scanner;
public class AccountTest 
{
	public static void main(String[] args) 
	{
	Account acct1 = new Account("Nancy", 500);
	Account acct2 = new Account("Tom", 1000);

	System.out.printf("%s, balance: $%.2f%n", acct1.getName(), acct1.getBalance());
	System.out.printf("%s, balance: $%.2f", acct2.getName(), acct2.getBalance());
	
	Scanner input = new Scanner(System.in);
	System.out.print("\n\nPlease enter the withdrawal amount for Account1:");
	double withdrawAmount = input.nextDouble();
	acct1.withdraw(withdrawAmount);
	
	System.out.printf("%n%s, balance: $%.2f%n", acct1.getName(), acct1.getBalance());
	System.out.printf("%s, balance: $%.2f", acct2.getName(), acct2.getBalance());
	
	System.out.print("\n\nPlease enter the withdrawal amount for Account2:");
	withdrawAmount = input.nextDouble();
	acct2.withdraw(withdrawAmount);
	
	System.out.printf("%n%s, balance: $%.2f%n", acct1.getName(), acct1.getBalance());
	System.out.printf("%s, balance: $%.2f%n", acct2.getName(), acct2.getBalance());
	}
	
}
