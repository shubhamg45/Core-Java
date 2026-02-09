class Engine{
	String type;
	String transmisssion;
	int piston;
	double bhp;
	double capacity;
	int gears;

	Engine(String type, String transmisssion,int piston,double bhp,
double capacity,int gears){
		this.type=type;
		this.transmisssion=transmisssion;
		this.piston=piston;
		this.bhp=bhp;
		this.capacity=capacity;
		this.gears=gears;
	}
	public void dispalyEngine(){
		System.out.println(" \n Engine Info ");
		System.out.println("Type : "+type);
		System.out.println("Transmisssion : "+transmisssion);
		System.out.println("Piston : "+piston);
		System.out.println("BHP : "+bhp);
		System.out.println("Capacity : "+capacity);
		System.out.println("Gears : "+gears);
	}
	public void startEngine(){
		System.out.println("Engine Started ");
	}
}
class Car{
	String brand;
	String model;
	String color;
	double price;
	Engine engine;

	Car(String brand,String model,String color,double price){
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.engine=new Engine("petrol","Manual",4,450,2500,6);
	}
	public void displyCar(){
		System.out.println("\n Car deatils");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
	}
}
class CompositionExample{
	public static void main(String[] args) {
		Car obj=new Car("toyota","fortuner","Black",5000000);
		obj.displyCar();
		obj.engine.dispalyEngine();
		obj.engine.startEngine();
	}
}