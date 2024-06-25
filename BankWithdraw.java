import java.util.Scanner;
class InSufficientBalance extends Exception
{
	public InSufficientBalance(String msg)
	{
		super(msg);
	}
}
class BankWithdraw
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit : ");
		int amount = sc.nextInt();
		System.out.println("Enter the amount to withdraw : ");
		int withdraw = sc.nextInt();
		try
		{
			if(withdraw > amount)
			{
				throw new InSufficientBalance("Withdraw amount is exceed more than balance");
			}
			else
			{
				int balance = amount - withdraw;
				System.out.println("Remaining balance in the account is : "+balance);
			}
		}
		catch(InSufficientBalance isb)
		{
		    System.out.println(isb.getMessage());
		}
	}
}