import java.util.Scanner;
class CompileTimeError
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World !");
		System.out.println("This line gets compile time error because semicolon is missing ")
	}
}
/*javac CompileTimeError.java
CompileTimeError.java:8: error: ';' expected
                System.out.println("This line gets compile time error because semicolon is missing ")
                                                                                                     ^
1 error
*/
