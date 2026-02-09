class Example121
{
	static int a =20;
	static{
		System.out.println("hello from SB of Example121");
	}
	{
		System.out.println("hhhh");
	}
	public static void m1(){
		System.out.println("Hey from SM of Example121");
	}
	public void m2()
	{
		System.out.println(a);
		m1();
	}
	public static void main(String[] args) {
		new Example121().m2();
	}
}