import java.util.Scanner;
class PrimeNumberMethod
{
	public static void main(String[] args) 
	{
	System.out.print("Enter the Number ");	
	int num = new Scanner(System.in).nextInt();
	isPrime(num);

	}
	public static void isPrime(int num)
	{
		int cnt=0;
		for (int i=1;i<=num ;i++ ) 
			if(num%i==0)
				cnt++;

			if (cnt==2)
			{
				System.out.println(num+ " is prime");
			}
			else{
				System.out.println(num+ " is not Prime");
			}
	}
}