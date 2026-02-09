class Address{
	String lane;
	String locality;
	String city;
	int pincode;

	Address(String lane,String locality,
		String city,int pincode)
	{
		super();
		this.lane=lane;
		this.locality=locality;
		this.city=city;
		this.pincode=pincode;
	}
	public void displayAddress(){

		System.out.println("Address Details ");
		System.out.println("LANE : "+lane);
		System.out.println("LOCALITY : "+locality);
		System.out.println("CITY : "+city);
		System.out.println("PINCODE : "+pincode);
	}
}
class Amazon{
	String userName;
	String password;
	long contact;
	String email;
	Address address;

	Amazon()
	{
		super();
	}

	Amazon(String userName,String password,
		long contact,String email,Address address)
	{
		super();
		this.userName=userName;
		this.password=password;
		this.contact=contact;
		this.email=email;
		this.address=address;
		
	}
	public void displayAmazonInfo()
	{
		System.out.println("Amazon Details");
		System.out.println("USERNAME : "+userName);
		System.out.println("PASSWORD : "+password);
		System.out.println("CONTACT : "+contact);
		System.out.println("EMAIL : "+email);
		address.displayAddress();
	}

}
class Bank{
	String name ;
	String ifsc;
	long accountNum;
	double balance;

	Bank(String name,String ifsc,
	long accountNum,double balance)
	{
		super();
		this.name=name;
		this.ifsc=ifsc;
		this.accountNum=accountNum;
		this.balance=balance;
	}
	public void displayBank(){
		System.out.println("BANK DETAILS ");
		System.out.println("NAME : "+name);
		System.out.println("IFSC CODE : "+ifsc);
		System.out.println("ACCOUNT NO : "+accountNum);
		System.out.println("BALANCE : "+balance);
	}

}
class AmazonPay extends Amazon{
	String upiID;
	Bank bank;
	int pin ;
	double wallet;

	AmazonPay(){
		super();
	}

	AmazonPay(String userName,String password,
		long contact,String email,Address address,
	    String upiID,Bank bank,int pin,double wallet)
	{
		super(userName,password,contact,email,address);
		this.upiID=upiID;
		this.bank=bank;
		this.pin=pin;
		this.wallet=wallet;
	}
	public void displayAmazonPay(){
		displayAmazonInfo();
		System.out.println("AMAZON PAY DEATAIlS ");
		System.out.println("UPIID : "+upiID);
		System.out.println("PIN : "+pin);
		System.out.println("WALLET : "+wallet);
		bank.displayBank();
	}	
}

class DriverExampleAmazon{
	public static void main(String[] args) {
		Address address=new Address("JM ROAD ","DECCAN","PUNE",411005);
		Bank bank=new Bank("SBI ","SBIN000123",123456789l,5000000);

		AmazonPay pay=new AmazonPay("RAMESH KUMAR ","ramesh@133",9876543210l,"ramesh123@gmail.com",address,
	                                "9876@ybl123",bank,123123,4000);
		pay.displayAmazonPay();
	}
}