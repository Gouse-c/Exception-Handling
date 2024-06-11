class TryCatch4
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
			e.getMessage();
		}
	}
}
/*
>javac TryCatch4.java
>java TryCatch4
Statement 1
--------------If an exception is raised at line 8 and corresponding 
--------------catch block is not matched then we get o/p as statement 1 only
--------------Abnormal Termination
*/
