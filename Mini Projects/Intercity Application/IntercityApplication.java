import java.util.Scanner;
import java.util.ArrayList;
class Driver{
	private String name;
	private long contact;

	//Paramerized constructor of Driver 
	Driver(String name,long contact){
		this.name=name;
		this.contact=contact;
	}
	// Getter() to get the data
	public void getDriver(){
		System.out.println("\n DRIVER INFO ");
		System.out.println("NAME : "+name);
		System.out.println("CONTACT : "+contact);
	}
}
// to store cab type capacity and info
class Cab{
	static int id=355;
	private Driver driver;
	private String number;
	private String intercityId;
	private String type;
	private int capacity;
	private String status="AVAILABLE";
	private String location="DECCAN";
    
    //creating a array to store the cap name and capacity of cap

    String [] typeVehicle={"hatchback","sedan","suv","muv"};
    int [] vehicleCapacity={3,4,5,6};

    {
    	this.intercityId = "INTERCITY" +id++;
    }
    //constructor odf Cab
    Cab(String number ,String type,Driver driver){
    	this.number=number;
    	this.type=type.toLowerCase();

    	int index=0;
    	for (String element : typeVehicle ) {
    		if (type.toLowerCase().equals(element)) {
    			break;
    		}
    		index++;
    	}
    	this.capacity=vehicleCapacity[index];
    	this.driver=driver;
    }
    //to get a cab details getter method()

    public void getCabDetails(){
    	System.out.println("\n CAB DETAILS ");
    	System.out.println("InterCity ID : "+intercityId);
    	System.out.println("Status : "+status);
    	System.out.println("Type : "+type);
    	System.out.println("Capacity : "+capacity);
    	System.out.println("Location : "+location);
    	System.out.println("");
    }
    public String getCabNumber(){
    	return number;
    }
    public Driver getDriver(){
    	return driver;
    }
    public String getStatus(){
    	return status;
    }
    public void setStatus(String newStatus){
    	status=newStatus;
    }
    public int getCapacity(){
    	return capacity;
    }
    public String getIntercityId(){
    	return intercityId;
    }
}
class IntercityApplication{
	public static void main(String[] args) {
		Intercity intercity =new Intercity();
		intercity.homeModule();
	}
}
class Passenger{
	private String name; 
    private long contact;
    private String email;
    private String pickupLocation;
    private String dropLocation;
    private int seats; 

    Passenger(String name, long contact,String email,
    	String pickupLocation,String dropLocation,int seats){

    	super();
    	this.name=name;
    	this.contact=contact;
    	this.email=email;
    	this.pickupLocation=pickupLocation;
    	this.dropLocation=dropLocation;
    	this.seats=seats;
    }
    public String getName(){
    	return name;
    }
    public void setName(String newName){
    	this.name=newName;
    }
    public long getContact(){
    	return contact;
    }
    public void setContact(long newContact)
    {
    	this.contact=newContact;
    }
    public String getEmail(){
    	return this.email;
    }
    public void setEmail(String newEmail){
    	this.email=newEmail;
    }
    public String getPickupLocation(){
    	return pickupLocation;
    }
    public void setPickupLocation(String newPickupLocation){
    	this.pickupLocation=newPickupLocation;
    }
    public String getDropLocation(){
    	return dropLocation;
    }
    public void setDropLocation(String newDropLocation){
    	this.dropLocation=newDropLocation;
    }
    public int getSeats(){
    	return seats;
    }
    public void setSeats(int newSeats){
    	this.seats=newSeats;
    }
}
class Intercity
{
  String [] stops={"DECCAN","MANPA","SHIVAJINAGAR","SANGAMWADI","YERWADA"};
  int [] distances={0,2,5,8,10};
	ArrayList<Cab> listCabs=new ArrayList<Cab>();
	Passenger passenger;
	Cab currentCab;

	{
		Cab cab1 =new Cab("MH-12-AA-4342","sedan",new Driver("Ramesh Kumar",9876543210l));
        Cab cab2 =new Cab("MH-02-DS-8742","hatchback",new Driver("Ganesh Kumar",7896543210l));
        Cab cab3 =new Cab("MH-20-RK-7654","suv",new Driver("Mukesh Kumar",9887654310l));
        Cab cab4 =new Cab("MH-42-NR-9872","muv",new Driver("Dinesh Kumar",7786343210l));
        Cab cab5 =new Cab("MH-16-TR-7342","sedan",new Driver("Mahesh Kumar",9877657658l));
        Cab cab6 =new Cab("MH-21-AP-4365","suv",new Driver("Hitesh Kumar",9887612340l));
        Cab cab7 =new Cab("MH-18-TA-7742","sedan",new Driver("Ritesh Kumar",67867788990l));
        listCabs.add(cab1);
        listCabs.add(cab2);
        listCabs.add(cab3);
        listCabs.add(cab4);
        listCabs.add(cab5);
        listCabs.add(cab6);
        listCabs.add(cab7);
	}

	public void addPassenger(){
		System.out.println("Passenger Details ");
		
		System.out.print("NAME : ");
		String name=new Scanner(System.in).nextLine();
		System.out.print("CONTACT: ");
		long contact=new Scanner(System.in).nextLong();
		System.out.print("EMAIL : ");
		String email=new Scanner(System.in).next();
		System.out.print("PICKUP LOCATION: ");
		String pickup=new Scanner(System.in).next().toUpperCase();
		System.out.print("DROP LOCATION : ");
		String drop=new Scanner(System.in).next().toUpperCase();
		System.out.print("NO OF PEOPLE : ");
		int seats=new Scanner(System.in).nextInt();

		this.passenger=new Passenger(name,contact,email,pickup,drop,seats);

    }
    public void homeModule(){
    	for (; ; ) {
    		System.out.println("\n WEL-COME \n");
    		System.out.println("1.BOOK A RIDE ");
    		System.out.println("2.CANCEL RIDE");
    		System.out.println("3.RIDE HISTORY");
    		System.out.println("4.LOGOUT \n");
    		System.out.print("Enter your Response : ");
    		int resp=new Scanner(System.in).nextInt();

    		switch(resp){
                  case 1-> bookRide();
                  case 2-> cancelRide();
                  case 3-> rideHistory();
                  case 4-> {
                  	System.out.println("Thank You For Using InterCity ");
                  	System.exit(0);
                  }
                  default->System.out.println("Invalid Response");
                  
    		}
    	}

    }
    public void bookRide(){
      if (passenger==null) {
        addPassenger();
      }
    	System.out.println("\n BOOK A RIDE MODULE");
    	for (Cab element :listCabs ) 
    	{
    		if (element.getStatus()=="AVAILABLE" && passenger.getSeats()<=element.getCapacity()) 
    			element.getCabDetails();
    	}
    	System.out.println("\n Enter a INTERCITY ID : ");
    	String intercityId=new Scanner(System.in).next();
    	boolean assump=false;
    	for (Cab ele :listCabs ) {
    		if(ele.getIntercityId().equals(intercityId)){
    			System.out.println("your Ride Has Been Conformed");
    			currentCab=ele;
    			assump=true;
    			System.out.println("your Ride details");
    			ele.getCabDetails();
    			System.out.println("Cab Number : "+ele.getCabNumber());
    			ele.getDriver().getDriver();
          double fare=calculateFare(passenger.getPickupLocation(),passenger.getDropLocation());
          System.out.println("pickup : "+passenger.getPickupLocation());
          System.out.println("DROP : "+passenger.getDropLocation());
          System.out.println("\n FARE is : "+fare+"rs \n");
    			break;
    		}
    		
    	}
    	if(!assump)
    		System.out.println("\n Invalid IntercityID \n");
    }
    public double calculateFare(String pickup,String drop)
    {
      double fare=0;
      int pickupIndx= -1;
      int dropIndx= -1;
      int index=0;

      for (String point  :stops ) {
        if (pickup.equals(point)) {
          pickupIndx=index;
        }
        if (drop.equals(point)) {
          dropIndx=index;
        }
        index++;
      }
      fare=(distances[dropIndx]-distances[pickupIndx])*25;
      return fare;
    }

    public void cancelRide(){
    	if (currentCab==null) {
    		System.out.println("\n NO Ride Has Been Booked \n");
    		return;
    		
    	}
    	System.out.println("\n Cancel a Ride Module \n");
    	System.out.println("your Ride Details");
    	currentCab.getCabDetails();
    	System.out.println("cab Number : "+currentCab.getCabNumber());
    	currentCab.getDriver().getDriver();

    	System.out.println("Do U Want To Cancel Your Ride (YES/NO) : ");
    	String response=new Scanner(System.in).next();
    	if (response.equalsIgnoreCase("YES")) {
    		System.out.println("Your Ride Has Been Cancelled");
    		currentCab=null;
        passenger=null;
    	}
    }
    public void rideHistory(){
    	System.out.println("\n Ride History Module \n");
    }
}