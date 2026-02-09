class Vechile{
	String brand;
	String model;
	double price;
	String manufactureDate;

	Vechile(String brand,
	String model,
	double price,
	String manufactureDate)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.manufactureDate=manufactureDate;
	} 
	public void getVehicleDetails(){
		System.out.println("Vehicle Details  ");
		System.out.println("Brand : "+brand);
		System.out.println("model: "+model);
		System.out.println("Price : "+price);
		System.out.println("manufactureDate : "+manufactureDate);
	}
}
class Car extends Vechile{
	boolean ac;
	int airBags;
	int doors;
	boolean sunRoof;
	String fuelType;

	Car(boolean ac,int airBags,int doors,boolean sunRoof,String fuelType,
		String brand,String model,double price,String manufactureDate){
		super(brand, model,price,manufactureDate);
		this.ac=ac;
		this.airBags=airBags;
		this.doors=doors;
		this.sunRoof=sunRoof;
		this.fuelType=fuelType;
	}
	public void getCarDetails(){
		System.out.println("Car Details ");
		System.out.println("Ac : "+ac);
		System.out.println("AirBags : "+airBags);
		System.out.println("Doors : "+doors);
		System.out.println("Sunroof : "+sunRoof);
		System.out.println("Fuel Type : "+fuelType);
	}
	public void vehicleStart(){
		System.out.println("press button to start");
	}
	public void accelarate(){
		System.out.println("use pedle to move");
	}

}
 class SingleLevelInheritence{
 	public static void main(String[] args) {
 		Car obj=new Car(true,4,4,false,"Disel","Mahindra","Scorpio",1800000,"12/jun/2024");

 		obj.getCarDetails();
 		obj.getVehicleDetails();
 		obj.vehicleStart();
 		obj.accelarate();
 	}
}

