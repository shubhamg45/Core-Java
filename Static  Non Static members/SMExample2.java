//accessing static member inside non static 
class SMExample2
{
	public static void main(String[] args) {
	     SMExample2 obj =new SMExample2();   //here to accesing NSM in SM so OBJ are Created
	     obj.m3();
	}
	SMExample2()
	{
		m1();
		System.out.println("from constructor");
	}
	{
		m2();
		System.out.println("from non static block");
	}
	public static void m1()
	{
		System.out.println("m1 static");
	}
	public static void m2()
	{
		System.out.println("m2 Static");
	}
	public void m3(){
		m1();
		System.out.println("m3 non static");
	}
}