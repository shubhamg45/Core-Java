import java.util.Scanner;
class Demo6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int op=sumOfDigit(num,0);
		System.out.println(num+ " : "+op);
	}
	public static int sumOfDigit(int num,int sum) 
	{
		sum+=(num%10);
		num/=10;
		if (num==0) return sum;
		return sumOfDigit(num,sum);

	}
}