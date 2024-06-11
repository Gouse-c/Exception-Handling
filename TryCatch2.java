class TryCatch2
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println("Statement 3");
		}
		catch(Exception e)
		{
			System.out.println("Statement 4");
		}
		System.out.println("Statement 5");
	}
}
/*
>javac TryCatch2.java
>java TryCatch2
Statement 1
Statement 2
Statement 3
Statement 5
--------------------If there is no exception in try block
--------------------then it is Normal Termination
 */