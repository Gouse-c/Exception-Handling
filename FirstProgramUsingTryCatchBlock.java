import java.lang.ArithmeticException;
class FirstProgramUsingTryCatchBlock
{
	public static void main(String args[])
	{
		System.out.println("Statement 1");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Statement 2");
	}
}
/*
>javac FirstProgramUsingTryCatchBlock.java
>java FirstProgramUsingTryCatchBlock
Statement 1
5
Statement 2
-------------------Normal Termination */
