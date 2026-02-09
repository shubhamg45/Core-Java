class Mobile{
	String brand;
	String model;
	double price;
	int storage;
	String color;

	Mobile(String brand,String model,double price,int storage,String color)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.storage=storage;
		this.color=color;
	}

	public void displayMobileInfo()
	{
		System.out.println("\n  Mobile Info");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("Storage : "+storage);
		System.out.println("Color : "+color);

	}
}
class MobileDriver{
	public static void main(String[] args) {
		// Data Passes in conctructor at the time of obj creation
		Mobile obj =new Mobile("SAMSUNG","S25 Pro",120000,256,"White");  
		obj.displayMobileInfo();
		obj.brand="SAMSUNG";
		obj.model="S24";
		obj.price=120000;
		obj.storage=256;
		obj.color="black";
		// using ref variable obj call the displayMobileInfo() from another class
		obj.displayMobileInfo();
		}
}