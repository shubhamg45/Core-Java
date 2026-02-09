interface ShapeCalculator{

	public static final double PI=22.0/7.0;

	public abstract void areaOfCircle(double rad);
	public abstract void parimeterOfSquare(double sides);
	public abstract void areaOfSquare(double sides);
	public abstract void areaOfTriangle(double base, double height);
	public static void message(String name ){
		System.out.println("hey ! "+name+" welcome to Shape Calculator ");

	}

}
class ShapeCalculatorImp implements ShapeCalculator{
	public void areaOfCircle(double rad){

		double area= PI*(rad*rad);
		System.out.println("area of Circle : "+area);
	}
	public void parimeterOfSquare(double sides){

		double parimeterOfSquare= 4*sides;

		System.out.println("parimeter Of Square : "+parimeterOfSquare);
	}
	public void areaOfSquare(double sides){

		double area = sides * sides;
		System.out.println("area of Circle is : "+area);

	}
	public void areaOfTriangle(double base, double height){

		double area = 0.5*base*height;

		System.out.println("area of triangle is : "+area);
	}
	public static void message(String name ){
		System.out.println("hey ! "+name+" welcome to Shape Calculator implementation ");

	}



}
class ShapeCalculatorDriver{
	public static void main(String[] args) {

		ShapeCalculatorImp obj=new ShapeCalculatorImp();

		ShapeCalculatorImp.message("raju");

		obj.areaOfCircle(5);
		obj.areaOfSquare(10);
		obj.areaOfTriangle(4,3);
		obj.parimeterOfSquare(6);


		
	}
}