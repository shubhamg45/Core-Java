import java.util.Scanner;
class AreaAndPerimeterOfCircle{
	static final double PI=3.14;
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		double radius=sc.nextDouble();

		double perimeter=2*PI*radius;
		double area=PI*radius*radius;

		System.out.println("Area of Circle is : "+area);
		System.out.println("Perimeter  of Circle is : "+perimeter);

		
	}
}