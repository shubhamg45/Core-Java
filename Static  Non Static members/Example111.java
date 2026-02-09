class Example111
{
	public void m2(){
		Example123 obj1=new Example123();
		obj1.m1();

	}
	public static void main(String[] args) 
	{
		new Example111().m2();
	}
}
class Example123{

	public void m1(){
		System.out.println("non static method m1()");
	}
	{
		System.out.println("non static Block Example123");
	}
	static{
		System.out.println("static block Examplle123");

	}
}