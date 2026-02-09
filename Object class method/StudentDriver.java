// toString() of object class implicitly shows fully Qualified Name i.e
// classname@hashcodevalue
// and we override this method and give own structure
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
    public String toString(){
    	return "[name : "+name+" , ID : "+id+" , collage : "+collage+" ]";
    }
 }

class StudentDriver{
	public static void main(String[] args) {

		Student s1=new Student("shubham",123,"TMV");

		System.out.println(s1);
         
		
	}
}