abstract class Opertaion{
	abstract void add(int a, int b);
	abstract void sub(int a, int b);
	abstract void mul(int a, int b);
	void div(int a ,int b){
		System.out.println(a/b);
	}

}
class OperationImp extends Opertaion{
	void add(int p, int q){
		System.out.println(p+q);
	}
	void sub(int x, int y){
		System.out.println(x-y);
	}
	void mul(int r , int n){
		System.out.println(r*n);
	}
}
class DriverExample1{
	public static void main(String[] args) {
		OperationImp s1=new OperationImp();
		s1.add(10,20);
		s1.sub(30,10);
		s1.mul(4,5);
		s1.div(10,2);
		
	}
}