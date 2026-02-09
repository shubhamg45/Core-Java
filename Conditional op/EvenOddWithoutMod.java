import java.util.Scanner;
class EvenOddWithoutMod{
	public static void main(String[] args) 
	{
	     System.out.print("Enter the Number ");
	     int num = new Scanner(System.in).nextInt();
	     //boolean op = ((num/2)*2==num);
	   // System.out.println(num+"Enterd number is even "+op);
	    

	    System.out.print(((num/2)*2==num)? "is even" : "is Odd");
	   
	}
}