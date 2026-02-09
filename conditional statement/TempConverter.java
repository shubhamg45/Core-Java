import java.util.Scanner;
class TempConverter
{
	public static void main(String[] args)
    {
	     Scanner sc = new Scanner(System.in);
	     for (; ; ) {

	     	System.out.println();
			System.out.println(      "WEL-COME    " );
			System.out.println();
			System.out.println( "1.CELCIUS    2.FAHRENHEIT     3.KELVIN"  );
			System.out.println("0.EXIT");
			System.out.println();

			System.out.println("Enter the First Input Response : ");
			int firstInput = sc.nextInt();

			System.out.println("Enter the Temprature for First Input : ");
			double temp1=sc.nextDouble();

			String response1="";

			if (firstInput==1) {

				response1="CELCIUS";

			}
			else if (firstInput==2) {
				response1="FAHRENHEIT";
				
			}
			else if (firstInput==3) {
				response1="KELVIN";
				
			}else if (firstInput==0) {
				return;
				
			}
			else{
				System.out.println("WRONG INPUT INTERED");
				continue;
			}
	     	
	     	// for SECOND INPUT

	     	// for (; ; ) {
	     		System.out.println("Enter the Second Input Response : ");
			int secondInput = sc.nextInt();
			String response2="";

			if (secondInput==1) {

				response2="CELCIUS";

			}
			else if (secondInput==2) {
				response2="FAHRENHEIT";
				
			}
			else if (secondInput==3) {
				response2="KELVIN";
				
			}else 
			if (firstInput==0) {
				return;
				
			}
			else{
				System.out.println("WRONG INPUT INTERED");
				break;
			}
			double result=0;
			System.out.println();
			System.out.println("   FIRSTINPUT       SECONDINPUT");
			System.out.println("   "+response1+"   "+response2);
			System.out.println("  "+temp1+"   "+result);
			System.out.println();

			if (response1.equals("CELCIUS")&&response2.equals("CELCIUS")) {

				result=temp1;
				System.out.println(result);

			}
			else if (response1.equals("CELCIUS")&&response2.equals("FAHRENHEIT")) {
				result=(temp1 *9/5)+32;
				System.out.println(result);
				
			}
			else if (response1.equals("CELCIUS")&&response2.equals("KELVIN")) {
				result=temp1 + 273.15;
				System.out.println(result);

	     	}
	     	else if (response1.equals("FAHRENHEIT")&&response2.equals("FAHRENHEIT")) {
				result=temp1 ;
				System.out.println(result);

	     	}
	     	else if (response1.equals("FAHRENHEIT")&&response2.equals("CELCIUS")) {
				result=(temp1 -32) *5/9; 
				System.out.println(result);

	     	}
	     	else if (response1.equals("FAHRENHEIT")&&response2.equals("KELVIN")) {
				result=(temp1 -32) *5/9 +273.15;
				System.out.println(result);

	     	}
	     	else if (response1.equals("KELVIN")&&response2.equals("KELVIN")) {
				result=temp1 ;
				System.out.println(result);

	     	}
	     	else if (response1.equals("KELVIN")&&response2.equals("CELCIUS")) {
				result=temp1 - 273.15;
				System.out.println(result);

	     	}
	     	else if (response1.equals("KELVIN")&&response2.equals("FAHRENHEIT")) {
				result=(temp1 - 273.15)*9/5 + 32;
				System.out.println(result);

	     	}


	     }
	     


	}
}

