// Accessing static method in any static member
class demo
{
	public static void main(String[] args) 
	{
		System.out.println("main ");
		m1();

	}
	public static void m1()
	{
		System.out.println("m1() static ");
	}
	public static void m2()
	{
		m1();
		System.out.println("m2() ststic ");
	}
	static{
		m1();
		System.out.println("static Block");
	}
}