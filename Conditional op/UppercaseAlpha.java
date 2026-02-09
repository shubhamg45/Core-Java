// uppercase Alphabet or not 
import java.util.Scanner;
class UppercaseAlpha{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Character : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch>='A'&& ch<='Z') ? " is Uppercase " : " is Lowercase");
	}
}