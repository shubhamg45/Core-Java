import java.util.Scanner;
class DriverExample
{
	static{
		Scanner sc =new Scanner(System.in);
       System.out.print("enter the number: ");
       int num=sc.nextInt();
        revNum(num);
        System.exit(0);
	}
	public static void revNum(int num)
	{  
		int dup=num;
		int rev=0;
		while (num!=0) 
		{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
	   }
	   System.out.println("The Reverse of "+dup+" is "+rev);
	}
}