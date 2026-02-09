import java.util.Scanner;
class MinuteToYearDays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Minutes : ");
		long minutes=sc.nextLong();
		// int minInYear=365*24*60;
		// int year=minutes/minInYear;
		// int days=(minutes%minInYear)/(24*60);

		long days=minutes/1440;
		long year=days/365;
		days=days-(year*365);


	    System.out.println(minutes+ " means the "+year+" Year "+days+" days");
		
	}
}