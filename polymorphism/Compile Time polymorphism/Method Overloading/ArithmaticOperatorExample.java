//Method overloading in single classs

class ArithmaticOperator{

	public  int  addition(int num1, int num2){
		return addition(num1,num2,0);
	}
	public  int  addition(int num1, int num2,int num3){
		return addition(num1,num2,num3,0);
	}
	public  int addition(int num1, int num2,int num3, int num4){
		return addition(num1,num2,num3,num4,0);
	}
	public  int  addition(int num1, int num2,int num3, int num4,int num5){
		int op=num1+num2+num3+num4+num5;
		System.out.println(op);
		return op;
	}
}
class ArithmaticOperatorExample{
	public static void main(String[] args) {
		ArithmaticOperator obj=new ArithmaticOperator();
		obj.addition(10,20);
		// ArithmaticOperator.addition(10,20,30);
		// ArithmaticOperator.addition(10,20,30,40);
		// ArithmaticOperator.addition(10,20,30,40,50);

		
	}
}