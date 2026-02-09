import java.util.Scanner;
class FactorialOfNumber
{
	public static void main(String[] args) 
	{
	   System.out.print("Enter the Number : ");	
	   int num = new Scanner(System.in).nextInt();
	   factorial(num);
	}
	public static void factorial(int num)
     {
           int fact=1;
           
		for (int i =1 ;i<=num ;i++ ) 
		{	
		fact*=i;		
		}
		System.out.println("factorial"+fact);
	}
}