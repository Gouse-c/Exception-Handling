import java.util.Scanner;
class ArithmeticException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x=sc.nextInt();
		System.out.println("Enter the value of y : ");
		int y=sc.nextInt();
		int z=x/y;
		System.out.println("The result of z is : "+ z);
	}
}