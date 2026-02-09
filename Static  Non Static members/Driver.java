class Parent 
{
	String a="hii";
	int b;
	{
		System.out.println("NSB");
	}
	Parent(int b){
		this.b=b;
	}
}
class child extends Parent{
	static int c=20;
	child(int b)
	{
		super(b);
	}
	static{
		System.out.println("SB");
	}
	public static void m1(){
		System.out.println("m1()");
	}
}
class Driver
{
	public static void main(String[] args) {
		child obj=new child(10);
		obj.m1();
		System.out.println(obj.c);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}