import java.util.Scanner;
class VowelOrConsonent{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Character : ");
		char ch = sc.next().toUpperCase().charAt(0);

		System.out.println((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')? " is Vowel " : " is Consonent ");
	}
}