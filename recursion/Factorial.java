import java.util.Scanner;
class Factorial
{     
	    static int num,fact=1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		num=sc.nextInt();
		factorialOfNumber();

		System.out.println(num+" factor of Numbers is "+fact);
	}
	public static void factorialOfNumber() 
	{
		for (int i =1 ;i<=num ;i++ ) 
		{	
		fact*=i;		
		}
		return;
	}
}