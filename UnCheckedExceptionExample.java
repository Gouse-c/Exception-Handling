import java.io.*;
class UnCheckedExceptionExample
{
	public static void main(String args[])throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello..");
		System.out.println(10/0);
	}
}
/*javac UnCheckedExceptionExample.java
>java UnCheckedExceptionExample
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at UnCheckedExceptionExample.main(UnCheckedExceptionExample.java:8)
		*/
		