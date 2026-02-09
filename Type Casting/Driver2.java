class Parent{
	void bike(){
		System.out.println("Royal Enfield");
	}
}
class Son extends Parent{
	void car(){
		System.out.println("xuv 300");
	}
}
class Driver2{
	public static void main(String[] args) {
		
		// Son obj =new Son();
		// obj.bike();
		// obj.car(); // cannot access CTE becz Parent can access only own method 

		// Parent obj1=(Parent)obj;
		// obj1.bike();
		// obj1.car();

		Parent obj =new Parent();

		Son obj1=(Son)obj;  // occur ClassCastException  
		obj1.bike();
		obj1.car();


		// Parent obj2=new Son(); // Generalization ,upcasting 

		// obj2.car();


	}

}