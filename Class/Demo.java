// class loading process in java 
public final class Demo  // class  cannot be inherites
{
	static int a=10;
	static double b=20;
	public short c;

    // execute first because static block which is used to initialize the static variable
	//  at the time of class Loading Process
	static{
		//static int a=10;
	    //static double b=20;
		System.out.println("static Block ");    
	}
	public static void main(String[] args) {
		System.out.println("main() ");
		m1();
	}
	public static final int m1(){  //method cannot be override 
		System.out.println("m1() ");
		return 10;
	}

}
/*
output :
static block 
main()
m1()
*/