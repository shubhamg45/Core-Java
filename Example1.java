// spy number....

import java.util.Scanner;
class Example1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int sum=0;
		int count=0;
		int pro=1;

		while(num!=0){
			count=num%10;
			sum+=count;
			pro*=count;
			if(sum==pro)
			{
				System.out.println(num+"is spy number ");
				break;
			}
		}
	}
}