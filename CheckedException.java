import java.io.*;
class CheckedException
{
	public static void main(String args[])
	{
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello...");
	}
}
/*
>javac CheckedException.java
CheckedException.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                PrintWriter pw = new PrintWriter("abc.txt");
				*/
				