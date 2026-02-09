import java.util.Scanner;
class FactorsOfNumbers
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		findFactors(num);
	}
	public static void findFactors(int num)
	{
		for (int i=1;i<=num ;i++ ) {
			if(num%i==0)
				System.out.println(i);
			
		}
	}
}