sealed class A permits B,C{
	void show(){
		System.out.println("Show from sealed class A");
	}

}
final class B extends A{
	void show(){
		System.out.println("show from class B");
	}

}
final class C extends A{
	void show(){
		System.out.println("show from class c");
	}

}
class Example1{
	public static void main(String[] args) {
		A obj=new C();
		obj.show();  // due to override child method show become accessible


		
	}
}