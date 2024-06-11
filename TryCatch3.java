class TryCatch3
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Statement 1");
			System.out.println(10/0);
			System.out.println("Statement 2");
		}
		catch(Exception e)
		{
			System.out.println(10/2);
		}
		System.out.println("Statement 4");
	}
}
/*
>javac TryCatch3.java
>java TryCatch3
Statement 1
5
Statement 4
-------------If ane exception is raised at line 8 and corresponding
-------------catch block is matched then o/p is */