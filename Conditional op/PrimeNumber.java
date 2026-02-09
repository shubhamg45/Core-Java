import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number  : ");
		int num = sc.nextInt();

		String op = (num>1)?
		          ((num==2 ||num==3 ||num==5||num==7) ?
		         ("is prime"):
		         ((num%2==0||num%3==0||num%5==0||num%7==0|| num%9==0)?
		         ("is not prime"):
		         ("is Prime"))):
		         ("is not Prime");

		// String op=(num>1)? 
		//           ((num==2 || num==3 || num==5 || num==7)?
		//           ("is prime "): 
		//           ((num%2==0 || num%3==0 || num%5==0 ||num%7==0)?
		//           ("is not prime"):
		//           ("is prime "))):
		//           ("is not prime");

		         System.out.println(op);


	}
}