class RunTimeSackMechanism
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
		System.out.println("Hello...");
	}
}
/*
>javac RunTimeStackMechanism.java
>java RunTimeStackMechanism
Hello...*/