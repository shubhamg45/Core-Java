//access static method one class to another 
class Example501
{
  public static void main(String[] args) 
  {
  	System.out.println("main method ");
  	Example502.m1();
  }
  public static void m2(){
  	System.out.println("m2 method from Example501 class ");

  }
}
class Example502
{
	public static void m1()
	{
		System.out.println("m1 method from Example502 class");
		Example501.m2();
	}
}