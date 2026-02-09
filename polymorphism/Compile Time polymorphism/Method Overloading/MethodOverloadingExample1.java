//Method overloading means creating more than one method in class with same name and different Parameter 

//In this Ex concat method is overloading by using  int, double, booolean type of data

class MyString{
	String str;

	public MyString(String str){
		this.str=str;
	}
	public String displayMyString(){
		System.out.println(str);
		return str;
	}
	public MyString concat(int data){
		str=str+data;
		return this;

	}
	public MyString concat(double data){
		str=str+data;
		return this;
		
	}
	public MyString concat(boolean data){
		str=str+data;
		return this;
	}

}
class MethodOverloadingExample1{
	public static void main(String[] args) {
		MyString obj1=new MyString("Hello");
		obj1.displayMyString();

		obj1=obj1.concat(1234);
		obj1.displayMyString();

		obj1=obj1.concat(234.12);
		obj1.displayMyString();

		obj1=obj1.concat(false);
		obj1.displayMyString();
		
	}
}