import java.util.Scanner;

class SumOfdigit{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num=sc.nextInt();
	int dup=num;
	int sum=0;

	while(num>0){
		int last =num%10;
		num/=10;
		sum=sum+last;

	  }
	  System.out.println("The Sum of "+dup+" is "+sum);
		
	}
}