class Parent
{
	public final void m1()
	{
		System.out.println("Hello World");
	}
}
class Child extends Parent
{
	public  final void m1()
	{
		System.out.println("Good Morning");
	}
}
class FinalKeyword1
{
	public static void main(String args[])
	{
		Parent p1 = new Parent();
		p1.m1();
		Child c1 = new Child();
		c1.m1();
	}
}
		