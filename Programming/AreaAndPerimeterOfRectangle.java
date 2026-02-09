import java.util.Scanner;
class AreaAndPerimeterOfRectangle{
	public static void main(String[] args) {

		System.out.println("Enter the Width : ");
		double width=new Scanner(System.in).nextDouble();	
		System.out.println("Enter the height  : ");
		double height=new Scanner(System.in).nextDouble();

		double area=width*height;
		double perimeter=2*(width+height);

		System.out.println("area of Rectangle is "+area );
		System.out.println("Perimeter of Rectangle is "+perimeter );


		
	}
}