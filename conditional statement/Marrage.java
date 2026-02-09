import java.util.Scanner;

class Marrage
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print( "enter your Age : ");
		int age = sc.nextInt();
		System.out.print("Enter your Property : ");
		long property = sc.nextLong();
		System.out.println("eneter your name : ");
		String surname = sc.next().toUpperCase();

		if(age>21 && property>=10000000 && surname.equals("AMBANI"))
		{
			System.out.println("you are Eligible to marry with that Girl ");
		}
		else
		{
			System.out.println("you are NOT Eligible to marry with that Girl ");

		}
	}
}