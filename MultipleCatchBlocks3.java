class MultipleCatchBlocks3
{
	public static void main(String args[])
	{
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(NullPointerException ne)
		{
			System.out.println("Null Pointer Exception Occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception is Executed");
		}
		System.out.println("Rest of the code is Executed");
	}
}