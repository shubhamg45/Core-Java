import java.util.Scanner;
class BillDiscount
{
	static double totalDisc;
	public static void main(String[] args) 
	{
	   System.out.println("Shopping start");
	   System.out.println();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Your Amount : ");
	   double billAmount = sc.nextDouble();
	   double disc= 15;

	   if (billAmount>=5000) {
	   	System.out.println(" you Got "+disc+"% Discount on Total bill");
	   		totalDisc=(billAmount/100)*disc;
	   	System.out.println("Total Discount is : "+totalDisc);
	   //	totalDisc=(billAmount/100)*disc;
	   	System.out.println("pay the Toatl Bill ");
	     	billAmount=(billAmount)-(billAmount/100)*disc;
	   	//         = 7000-7000/100*15 =7000-70*15=7000-1050=6950
	   }
	   System.out.println("Bill Amount Total is "+billAmount+"rs");
	   System.out.println("Shopping Ends");	
	}
}