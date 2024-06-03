import java.util.Scanner;
class RuntimeError
{
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Error is in main method ");
	}
}
/*java RuntimeError
Error: Main method not found in class RuntimeError, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/