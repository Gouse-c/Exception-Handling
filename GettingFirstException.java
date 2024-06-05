class GettingFirstException
{
	public static void main(String args[])
	{
		doStuff();
	}
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}
}
/*
>javac GettingFirstException.java
>java GettingFirstException
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at GettingFirstException.doMoreStuff(GettingFirstException.java:13)
        at GettingFirstException.doStuff(GettingFirstException.java:9)
        at GettingFirstException.main(GettingFirstException.java:5)*/
