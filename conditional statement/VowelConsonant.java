import java.util.Scanner;
class VowelConsonant
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Character: ");

		char ch = sc.next().toUpperCase().charAt(0);


		if(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
		{
			System.out.println(" it is a Vowel");
		}
		if (!(ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )) 
		{
		System.out.println(" its Consonant ");	
		}
	}
}