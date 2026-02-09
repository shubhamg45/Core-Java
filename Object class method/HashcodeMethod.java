class Student{
	String name;
	int id;
	String collage;

	Student(String name, int id, String collage){
	super();
	this.name=name;
	this.id=id;
	this.collage=collage;
    }
   public int  hashCode(){
   	
   	return name.hashCode()+id+collage.hashCode(); 

    }
 }
class HashcodeMethod{
	public static void main(String[] args) {

		Student s1=new Student("shubham",123,"TMV");
		System.out.println(s1.hashCode()); // object class hashCode()
	}
}