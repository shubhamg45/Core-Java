import java.util.Scanner;
class FeetToMeter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the feet : ");
		double feet = sc.nextDouble();

		double meters = feet*0.305;

		System.out.println("the Entered Feets "+feet + " in meters "+meters);
		
	}
}