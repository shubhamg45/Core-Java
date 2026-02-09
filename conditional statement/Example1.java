import java.util.Scanner;
class Example1
{
   public static void main(String[] args) 
   {
   	System.out.println("shopping Starts");
   	System.out.println("enter the bill Amount");
   	double billAmount=new Scanner(System.in).nextDouble();
   	double disc = 15;
   	if (billAmount>=5000)
   	{
   		System.out.println("you got "+disc+"% Discount");
   		billAmount = (billAmount)-(billAmount/100)*disc;
   	}
   	System.out.println("total bill : "+billAmount);
   	System.out.println("shopping ends");

   }
}