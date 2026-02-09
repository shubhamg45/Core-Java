import java.util.Scanner;
class Example2{
	public static void main(String[] args) {
		System.out.print("enter the Number : ");
		int num = new Scanner(System.in).nextInt();
		if(num%2==0 && num%5!=0)
		{
			System.out.println("HiTwo");

		}
		if (num%5==0 && num%2!=0)
		{
			System.out.println("HiFive ");
		}
		if( num%2==0 && num%5==0)
		{
			System.out.println("HiTwo HiFive");
		}
	}
}