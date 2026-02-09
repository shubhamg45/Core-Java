class Demo1{
	String a;
	int b;

	Demo1(String a, int b){
		super();
		this.a=a;
		this.b=b;
	}
	public void displayDemo1()
	{
		System.out.println("class Demo1");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
class Demo2 extends Demo1{
	String c;
	int d;

	Demo2(String a,int b,String c,int d)
	{
		super(a,b);
		this.c=c;
		this.d=d;
	}
	Demo2(Demo2 oldObj)
	{
		super(oldObj.a,oldObj.b);
		this.c=oldObj.c;
		this.d=oldObj.d;
	}
	public void displayDemo2(){
		displayDemo1();
		System.out.println("class Demo2");
		System.out.println("c : "+c );
		System.out.println("d : "+d );

	}
}
class CopyConstructorExample1{
	public static void main(String[] args) {
		Demo2 oldObj=new Demo2("demo1",10,"demo2",20);
		oldObj.displayDemo2();

		Demo2 copyObj=new Demo2(oldObj);
		copyObj.displayDemo2();


		System.out.println("-------After Changes ");
		copyObj.a="DEMO1";
		copyObj.displayDemo2();
		oldObj.displayDemo2();
	}

}