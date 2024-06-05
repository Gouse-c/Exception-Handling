class GettingArithmeticException
{
	public static void main(String args[])
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println(10/0);
	}
	public static void doMoreStuff()
	{
		System.out.println("Hello...");
	}
}
/*
>javac GettingArithmeticException.java
>java GettingArithmeticException
Hello...
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at GettingArithmeticException.doStuff(GettingArithmeticException.java:10)
        at GettingArithmeticException.main(GettingArithmeticException.java:5)
		
Note : Only Two Methods are Terminated Abnormally ..and doMoreStuff() Method is
	   terminated Normally..!
*/