// is Example of ternary operator 


import java.util.Scanner;
class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the num1 :");
		float num1 = sc.nextFloat();
		System.out.print("Enter the num2 :");
		float num2 = sc.nextFloat();

		System.out.print("Enter the operator :");
		char opr = sc.next().charAt(0);
		String op = "";

		op =
		(opr=='+')?
		(op+=num1 + num2):
		((opr=='-')?
		(op+=num1 - num2):
		((opr== '*')?
		(op+= num1* num2):
		((opr=='/')?
		(op+=num1/num2):
		((opr=='%')?
		(op+=num1%num2):
		(op+="INVALID")))));

		if(op.equals("INVALID")){
			System.out.println("User You Have Entered Wrong Operator ");
			return;

		}
		System.out.println(num1+" "+opr+" "+num2+" = "+op);

	}
}