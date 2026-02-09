import java.util.Scanner;
class ConvertPoundIntoKg{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Weight In Pound : ");
	double pound=sc.nextDouble();

	final double KG=0.454;

	double kiloGram=pound*KG;
	System.out.println(pound+ " pound is "+kiloGram+" kilogram");
	  }

}