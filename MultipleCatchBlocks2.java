class MultipleCatchBlocks2
{
	public static void main(String args[])
	{
		try
		{
			int a[]= new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Index out of Bound");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code Executes");
	}
}