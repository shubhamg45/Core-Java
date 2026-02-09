class Parent{
	void habit(){
		System.out.println("playing a Chess");
	}

}
class Child extends Parent{
	 static void habit(){
		System.out.println("playing a Cricket");
	}

}
class OverrideDriver1{
	public static void main(String[] args) {

		Parent obj=new Child();
		obj.habit();
		
	}
}