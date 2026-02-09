import java.util.Scanner;
class PowerOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the base : ");
		int base = sc.nextInt();
		System.out.print("enter the Exponenet :");
		int exponent = sc.nextInt();

		power(base,exponent); 

	}
	public static void power(int base ,int exponent )
	{   
		if (exponent==0) {
			return;	
		}
		 int result=1;
		while (exponent!=0 ) {

			result*=base;
			--exponent;
		}
		System.out.println(result);
	}
}