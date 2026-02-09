/* find Even Odd number without Using % operator 
   there are two ways 
   1.num/2*2==num
   2.num/2==num/2.0 
*/
import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		
		if ((num/2)*2==num) {
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
		// (num%2==0);
		// (num/2==num/2.0);
		//((num/2)*2==num);
	}
}