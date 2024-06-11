class TryCatch1
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Statement 1");
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(20/10);
		}
		System.out.println("Statement 2");
	}
}
/*
>javac TryCatch1.java
>java TryCatch1
Statement 1
2
Statement 2
Normal Termination */
