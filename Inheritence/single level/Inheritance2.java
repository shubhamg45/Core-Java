import java.util.Arrays;
class Amazon{
	private String username;
	private String email;
	private String password;
	private long contact;
	private String gender;
	private String address;

	Amazon(String username, String email,String password,long contact,String gender,String address){
		this.username=username;
		this.email=email;
		this.password=password;
		this.contact=contact;
		this.gender=gender;
		this.address=address;
	}
	public void getAmazonInfo(){
		System.out.println("\n Amazon Info ");
		System.out.println("Username : "+username);
		System.out.println("email : "+email);
		System.out.println("password : "+password);
		System.out.println("contact : "+contact);
		System.out.println("gender : "+gender);
		System.out.println("address : "+address);
	}
}
class AmazonPrime extends Amazon{
	private String [] profiles={"ram","shyam"};
	private String password;
    private String subscription;
    private double price;
    private int users;

    AmazonPrime(String username, String email,String password,long contact,String gender,String address,
           String primePassword,String subscription,double price,int users){
    	super(username,email,password,contact,gender,address);
    	this.password=primePassword;
    	this.subscription=subscription;
    	this.price=price;
    	this.users=users;
    }
    public void getAmazonPrimeInfo(){
    	System.out.println("\n AmazonPrime Info ");
    	System.out.println("profiles : "+Arrays.toString(profiles));
    	System.out.println("password : "+password);
    	System.out.println("subscription : "+subscription);
    	System.out.println("price : "+price);
    	System.out.println("Users : "+users);
    }
}
class Inheritance2{
	public static void main(String[] args) {
		AmazonPrime obj=new AmazonPrime("Ganesh Pawar ","ganesh@gmail.com","gane123",9876543210l,"male","pune city ","prime@432","primium",2500,3);
		obj.getAmazonInfo();
		obj.getAmazonPrimeInfo();
	}
}