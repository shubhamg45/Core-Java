import java.util.Scanner;
class NumInYears{
	public static void main(String[] args) {
		int daysPerYear  = 365;
		int minutesPerDays = 60 * 24;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Minutes :");
		long minutes = sc.nextLong();

		long totaldays= minutes/minutesPerDays;

		long years = totaldays/daysPerYear;
		long days = totaldays%daysPerYear;

		System.out.println(minutes +" minutes is approximately " + years + " Years and " +days +" Days");

	}
}