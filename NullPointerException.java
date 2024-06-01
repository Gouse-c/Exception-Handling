import java.util.Scanner;
class NullPointerException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("Before Setting to null : "+ str);
		System.out.println("The length of the string is : "+str.length());
		str=null;
		System.out.println("The length of the string is : "+str.length());
		//System.out.println("After Setting to null "+str);
	}
}