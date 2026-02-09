import java.util.Scanner;
class Smaller{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("enter the number 1 : ");
		int num2 = sc.nextInt();
		System.out.print("enter the number 1 : ");
		int num3 = sc.nextInt();


		int smallest  = num1<num2 ? (num1<num3?num1 :num3 ): (num2<num3?num2 : num3);

		System.out.println("smallest number among Three  is "+smallest);


	}
}