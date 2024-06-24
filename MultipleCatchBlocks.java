class MultipleCatchBlocks
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Index out of bound");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception");
		}
		System.out.println("Rest of the code Executes");
	}
}