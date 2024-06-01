import java.util.Scanner;
class InputMisMatchException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		int b = sc.nextInt();
		int c=a+b;
		System.out.print("The value of c is :"+c);
	}
}