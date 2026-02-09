import java.util.Scanner;
class Demo5
{
	static int sum;
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number : ");
	    int num=sc.nextInt();
	    sumOfDigit(num);
	    System.out.println(num+" : "+sum);	
	}
	public static void sumOfDigit(int num)
	{
		int rem=num%10;
		sum+=rem;
		num/=10;
		if (num==0) return;
		sumOfDigit(num);
	}
}