import java.util.Scanner;
class Greater{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("enter the number 1 : ");
		int num2 = sc.nextInt();
		System.out.print("enter the number 1 : ");
		int num3 = sc.nextInt();


		int largest = num1>num2 ? (num1>num3?num1 :num3 ): (num2>num3?num2 : num3);

		System.out.println("largest is "+largest);


	}
}