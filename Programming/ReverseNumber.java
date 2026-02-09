// Reverse the number 

import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;

		while(num>0){
			int rem=num%10;
			num/=10;
			 rev=rev*10+rem;
		}		
		System.out.println(dup+" : "+rev);

	}

}