import java.util.Scanner;
class ReverseNo
{
	static int num,dup;
	static int rev=0;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		dup=num;
		reverse();
		System.out.println(dup+ " : "+rev);
	}
	public static void reverse() 
	{  
		if (num==0) return;
	    int rem=num%10;
	    // rev*=10+rem; //  rev=rev*10+rem
	     rev = rev * 10 + rem;
	    num/=10;
		reverse();
	}
}
