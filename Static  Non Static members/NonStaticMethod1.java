//we can access any static member of same  class inside NSM directly
class NonStaticMethod1{
	static String str="hello Java ";

	public static void m1(){
		System.out.println(" m1() from static method ");//3
	}
	public void m2(){
		System.out.println("m2() from Non static method");  //1
		System.out.println(str);                            //2
		m1();
	}
	public static void main(String[] args) {
		//new NonStaticMethod1.m2();
        // for accesing NSM inside static member obj creation is required
		NonStaticMethod1 obj = new NonStaticMethod1();
		obj.m2();
	}


}