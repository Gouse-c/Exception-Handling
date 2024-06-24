class MultipleCatchBlocks4
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
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Index out of Bound Exception Occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception is Executed");
		}
		System.out.println("Rest of the code is Executed");
	}
}