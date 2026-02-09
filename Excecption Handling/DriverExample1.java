//using Synchronized keyword

class Printing{
	public synchronized void m1(String name ){
		for (int i=1;i<=10 ;i++ ) {
			System.out.println(name+" :  "+i);
		}
	}

}
class MyThread extends Thread{
	Printing obj;

	MyThread(Printing obj){
		this.obj=obj;
	}
	public void run(){
		obj.m1("ramesh");
	}

}
class DriverExample1{
	public static void main(String[] args) {
		
		Printing obj=new Printing();
		obj.m1("main");
		MyThread t1=new MyThread(obj);
		t1.start();
		//obj.m1("main");
	}
}