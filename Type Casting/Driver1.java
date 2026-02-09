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
class Driver1{
	public static void main(String[] args) {

		Son s1=new Son(); 
		//creating the object of Son and store int Son type of var 
		s1.bike();     // Royal Enfield
		s1.car();      // Xuv 300

		Parent s2=new Son();  //Upcasting ---- accesing only parent class method
		//creating the object of Son and store int Parant type of var 
        // which means by using s2 obj ref we only call parent class method 
        // this is called as upcasting 
        //storing subclass object int superclass type var
        // also called as widening 

		s2.bike();  // Royal Enfield
		s2.car();  // CTE

		Son s3 =(Son)s2;  // Downcasting--- again make a subclass behave like superclass to subclass
		s3.bike();   // Royal Enfield
		s3.car();    // Xuv 300

		
	}
}