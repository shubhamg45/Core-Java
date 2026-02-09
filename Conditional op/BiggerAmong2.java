import java.util.Scanner;
class BiggerAmong2{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

	     System.out.print("Enter the Number1 ");
	    int num1 = sc.nextInt();

	      System.out.print("Enter the Number2 ");
	     int num2 = sc.nextInt();

	     int largest = num1>num2 ? num1 :num2;

	     System.out.println("Largest number is "+largest);
}
	}