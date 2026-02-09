//accessing static method inside any static member 
class SMExample
{
	public static void main(String[] args) {
		System.out.println("main");
		m1();
	}
	public static void m1()
	{
        System.out.println("m1() static");
        m2();
	}
	public static void m2()
	{
		System.out.println("m2() static");

	}
	static{
		m1();
		System.out.println("static Block");
	}
}