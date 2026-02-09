class Google
{
	String firstName;
	String lastName;
	String email;
	long contact;
	String password;
	String dob;
	String gender;
    
    //PARAMETERIZED CONSTRUCTOR OF GOOGLE CLASS
	Google(String firstName,String lastName,String email,long contact,
	String password,String dob,String gender)
	{
		super();   // PARENT CLASS OF GOOGLE 'S' CONSTRUCTOR OBJ IS CALLED 
		//ASSIGNING VALUE TO GLOBAL VAR
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.contact=contact;
		this.password=password;
		this.dob=dob;
		this.gender=gender;
	}
	public void displayGoogle()  //METHOD FOR DISPLAYING GOOGLE DATA
	{
		System.out.println("\n GOOGLE ACCOUNT DETAILS ");
		System.out.println("UserName : "+firstName+" "+lastName);
		System.out.println("Email : "+email);
		System.out.println("Contact : "+contact);
		System.out.println("PassWord : "+password);
		System.out.println("DOB : "+dob);
		System.out.println("Gender : "+gender+"\n");
	}
}
class GoogleMeet extends Google    //EXTENDING THE PROPERTIES OF GOOGLE CLASS I.E PARENT CLASS 
{
    String hostName;
    String schedule;
    String link;
    String id;
    final int CAPACITY=100;
    int join;
     
     //google meet constructor (parameterized)
    GoogleMeet(String firstName,String lastName,String email,long contact,
	String password,String dob,String gender,String hostName,
    String schedule,String link,String id,int join)
    {
    	super(firstName,lastName,email,contact,password,dob,gender);  //calling parent class constructor i.e google 
    	this.hostName=hostName;
    	this.schedule=schedule;
    	this.link=link;
    	this.id=id;
    	this.join=join;
    }

    public void displayGoogleMeet()     //method to display Googlemeet info
    {
    	displayGoogle();
    	System.out.println("\n GoogleMeet Details ");
    	System.out.println("HostName : "+hostName);
    	System.out.println("Schedule : "+schedule);
    	System.out.println("Link : "+link);
    	System.out.println("ID : "+id);
    	System.out.println("Join : "+join+"\n");
            
    }

}
class GoogleClassroom extends Google            //extending properties of google 
{
	String subject;
	String name;
	String code;
	String trainer;
	int numberStudents;
        

        // constroctor of Google class room (Parameterized)
    GoogleClassroom(String firstName,String lastName,String email,long contact,
	String password,String dob,String gender,String subject,String name,
	String code,String trainer,int numberStudents)
	{
		super(firstName,lastName,email,contact,password,dob,gender);  //super() to parent class constructor i.e google
		this.subject=subject;
		this.name=name;
		this.code=code;
		this.trainer=trainer;
		this.numberStudents=numberStudents;
	}
	public void displayGoogleClassroom()
	{
	   displayGoogle();
       System.out.println("\n GoogleClassroom Details ");
       System.out.println("Subject : "+subject);
       System.out.println("name : "+name);
       System.out.println("code : "+code);
       System.out.println("trainer : "+trainer);
       System.out.println("Number Students : "+numberStudents+"\n"); 
	}
  
}
class Bank
{
	String name;
	long number;
	double balance;

	Bank(String name,long number,double balance)
	{
       this.name=name;
       this.number=number;
       this.balance=balance;
	}
	public void displayBank()
	{
		System.out.println("\n BANK DETAILS ");
		System.out.println("Name : "+name);
		System.out.println("Number : "+number);
		System.out.println("Balance : "+balance+"\n");
	}

}
class GooglePay extends Google
{
  long contact1;
  String upiId;
  Bank bank=new Bank("SBI",9860744804l,500000);
  int pin;

  GooglePay(String firstName,String lastName,String email,long contact,
	String password,String dob,String gender,
    long contact1,String upiId,int pin )
  {
  	super(firstName,lastName,email,contact,password,dob,gender);
  	this.contact1=contact1;
  	this.upiId=upiId;
  	this.pin=pin;
  }
  public void displayGooglePay()
  {
  	displayGoogle();
  	System.out.println("\n GOOGLE-PAY Details ");
  	System.out.println("contact : "+contact1);
  	System.out.println("upiId : "+upiId);
  	System.out.println("Pin : "+pin+"\n");
  	bank.displayBank();
  }
}
class GoogleMain
{
     public static void main(String[] args) {

     	GooglePay obj1=new GooglePay("Ramesh","Kumar","rameshk@gmail.com",
        9998887776l,"ramesh@123","01/01/2000","male",8877665544l,"8877@ybl12",1234);
        obj1.displayGooglePay();

        GoogleMeet obj2=new GoogleMeet("Ganesh","Kumar","ganeshk@gmail.com",
        9998887776l,"ganesh@123","01/01/2001","male","hostGanesh","12 Am ",
        "www.joinganesh.com","ganesh14141",50);
        obj2.displayGoogleMeet();

        GoogleClassroom obj3= new GoogleClassroom("suresh","Kumar","sureshk@gmail.com",
        9998887776l,"suresh@123","01/01/2002","male","java","java Classroom notes","P2qR45b","Ram",66);
        obj3.displayGoogleClassroom();
     }
}