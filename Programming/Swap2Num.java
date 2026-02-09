class Swap2Num{

	public static void m1(){
		//By using 3rd var
		int a =10;
		int b=20;


		int temp=a;
		a=b;
		b=temp;

		System.out.println("a : "+a+" b: "+b);



	}
	public static void main(String[] args) {
		int a =10;
		int b=20;
  // wihout using 3rd var
		a=a+b; // 10+20=30
		b=a-b; //30-20=10   
		a=a-b; //30-10=20 

		System.out.println("a : "+a+" b: "+b);

		m1();
	}
}