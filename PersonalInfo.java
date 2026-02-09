import java.util.Scanner;
class PersonalInfo
{
	public static boolean personalInfo() 
	{
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Name : ");
    	String name = sc.nextLine();
    	

    	System.out.print("Enter the age : ");
    	byte age = sc.nextByte();
    	sc.nextLine();

    	System.out.print("Enter the address : ");
    	String address = sc.nextLine();
    	

    	System.out.print("Enter the Phone Number : ");
    	long phoneNumber = sc.nextLong();
    	sc.nextLine();

    	System.out.print("Enter the Stream : ");
    	String stream = sc.nextLine();
    	

    	System.out.print("Enter the year of passout : ");
    	short yop = sc.nextShort();
    	sc.nextLine();

    	System.out.print("Enter the Email : ");
    	String email = sc.nextLine();


    	if(personalInfo())
		{
			if (age<1) {

				System.out.println("wrong input");
				
			}
		}
		if (!(phoneNumber.length()==10)) {

			System.out.println("wrong input");
			
		}

    	System.out.print("...........................");

    	System.out.println("Name :" + name);
    	System.out.println("Age : "+age);
    	System.out.println("Address : "+address);
    	System.out.println("Phone Number : "+phoneNumber);
    	System.out.println("Stream : "+stream);
    	System.out.println("Passout Year  : "+yop);
    	System.out.println("Email : "+email);

	}
        public static void main(String[] args) {

		personalInfo();
		
	}
}