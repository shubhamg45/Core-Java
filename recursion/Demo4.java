import java.util.Scanner;
class Demo4
{
	static int num,dup;
	static int sum;
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number : ");
	    num=sc.nextInt();
	    dup=num;
	    sumOfDigit();
	    System.out.println(dup+" : "+sum);	
	}
	public static void sumOfDigit()
	{
		int rem=num%10;
		sum+=rem;
		num/=10;
		if (num==0) return;
		sumOfDigit();
	}
}