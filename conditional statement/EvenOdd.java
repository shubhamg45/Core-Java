import java.util.Scanner;
class EvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		if (num%2==0 && num!=0) 
		{
			System.out.println("Entered Number is even");
		}
		if (num%2!=0 && num!=0) 
		{
			System.out.println("Entered Number is Odd ");
		}

	}
}