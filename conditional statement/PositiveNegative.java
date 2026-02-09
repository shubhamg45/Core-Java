import java.util.Scanner;
class PositiveNegative 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Enter the Number : ");

	   int num = sc. nextInt();

	   if (num>0 && num!=0) 
	   {
	   	System.out.println("Positive ");
	   		
	   	}	
	   	if (num<0 && num!=0) 
	   	{
	   		System.out.println("Negative ");
	   	}
	   	if(num==0)
	   	{
            System.out.println("Neutral");
	   	}
	}
}