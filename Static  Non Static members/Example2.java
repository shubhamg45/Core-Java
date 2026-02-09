// accessing static method inside non static member in same class
class Example2
{
	Example2(){
		m1();
	}
	{
		m1();
	}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.m2();
	}
	public static void m1() 
	{
		System.out.println(" m1() static method");
	}
	public  void m2()
	{
		m1();
		System.out.println("m2() non stsic method");
	} 
}