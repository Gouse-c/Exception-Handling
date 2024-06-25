final public class Parent
{
	public void m1()
	{
			System.out.println("Good Morning");
	}
}
class Child extends Parent
{
	public void m1()
	{
		System.out.println("Hello World");
	}
}
class ClassDeclareFinal
{
	public static void main(String args[])
	{
		Parent p1 = new Parent();
		p1.m1();
		Child c1 = new Child();
		c1.m1();
	}
}