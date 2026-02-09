import java.util.Scanner;
class MonthExample
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		if(num<1 || num>12){
			System.out.println("Invalid Input ");

		}
		String month = switch(num)
		{
		case 1 -> "JAN";
		case 2 -> "FEB";
		case 3 -> "MAR";
		case 4 -> "APR";
		case 5 -> "MAY";
		case 6 -> "JUN";
		case 7 -> "JUL";
		case 8 -> "AUG";
		case 9 -> "SEP";
		case 10 -> "OCT";
		case 11 -> "NOV";
		case 12 -> "DEC";
		default -> "Invalid Input";
		};
		System.out.println(num + " : "+month);
	}
}