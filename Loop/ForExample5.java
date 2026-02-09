import java.util.Scanner;
class ForExample5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	   for (char ch=65;ch<=122 ;ch++ ) {
	   	System.out.println("Enter the number : ");
	   	char ch = sc.next().charAt(0);
	   	if (ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
	   		System.out.print(ch+ "  ");

	   		switch(ch)
	   		{
	   		 case 'A','a'-> System.out.println("Vowel");
	   		 case 'E','e'-> System.out.println("Vowel");
	   		 case 'I','i'-> System.out.println("Vowel");
	   		 case 'O','o'-> System.out.println("Vowel");
	   		 case 'U','u'-> System.out.println("Vowel");

	   		 default -> System.out.println("consonent");
	   		}
	   	}
	   
	   	
	   }

	}
}