public class NonStaticMethod2{
	String str="hello java";
	{
		System.out.println("non Static Block ");
	}
	public void m2(){
		System.out.println("m2() non Static Method ");
	}
	public void m1(){
		System.out.println("m1() non Static method");
		System.out.println(str);
		m2();
	}
	public static void main(String[] args) {
		new NonStaticMethod2().m1();
		//new NonStaticMethod2.m1();
		// NonStaticMethod2 obj=new NonStaticMethod2();
		// obj.m1();
	}

}