class Ramesh{

} 
class Suresh extends Ramesh{

} 
// upcasting means create a object of child class and store into parent class type 
// implicitly typecasting . no need to explicitly Cast it.
class UpcastingEx1{
	public static void main(String[] args) {
		Ramesh obj =new Suresh();
		if (obj instanceof Ramesh) {
			Suresh obj1=(Suresh)obj;
		}
		System.out.println("wrong ");
	}
}