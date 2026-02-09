import java.util.Scanner;
class FactorsWithCounts
{
	public static void main(String[] args) {
		

		System.out.print(" Enter the Number : ");
		int num = new Scanner(System.in).nextInt();
		findFactors(num);

	}
	public static void findFactors(int num)
	{
		int cnt=0;
		for (int i =1;i<=num ;i++ ) {

			if (num%i==0) {
				System.out.println(i);
				cnt++;
				
			}	
		}
		System.out.println("count : "+cnt);
	}
}