import java.util.Scanner;
class PrimeNumberMethod2
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num+ " is prime ");	
		}
		else{
			System.out.println(num+ " is not prime ");
		}
	}
	public static boolean isPrime(int num) {
		if(num<2)return false;
		for (int i=2;i<=num/2 ;i++ ) 
		   if (num%i==0) return false;
	      return true;
	}
}