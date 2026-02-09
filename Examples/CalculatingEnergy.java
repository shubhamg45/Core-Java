import java.util.Scanner;
class CalculatingEnergy{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Amout of Water in KG : ");
		double water = sc.nextDouble();

		System.out.print("Enter the initial Temperature :");
		double initTemp = sc.nextDouble();

		System.out.print("Enter the final Temperature :");
		double finalTemp = sc.nextDouble();

		 double energy = water*(finalTemp-initTemp)*4184;

		System.out.println("the energy needed is "+energy);
	}
}