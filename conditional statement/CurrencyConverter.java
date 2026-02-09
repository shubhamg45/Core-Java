import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (; ; ) 
		{
			System.out.println();
			System.out.println( " WELCOME ");
			System.out.println();
			System.out.println("List of Currency ");
			System.out.println("1. USD");
			System.out.println("2. ERU");
			System.out.println("3. GBP");
			System.out.println("4. CAD");
			System.out.println("5. AUD");
			System.out.println("6. CHF");
			System.out.println("7. MXN");
			System.out.println( " For EXIT Enter 0");
            System.out.println();

            System.out.print("Enter your Amount : ");
            float inr = sc.nextFloat();

            System.out.print(" Enter the Currency Code ");
            String code = sc.next().toUpperCase();
            boolean assump = true ;

            float convert =0;

            if (code.equals("USD")) {
            	convert = inr/85.59f;
            }
            else if (code.equals("ERU")) {
            	convert = inr/100.44f;
            }
             else if (code.equals("GBP")) {
            	convert = inr/116.56f;
            }
             else if (code.equals("CAD")) {
            	convert = inr/62.63f;
            }
             else if (code.equals("AUD")) {
            	convert = inr/56.15f;
            }
             else if (code.equals("CHF")) {
            	convert = inr/107.72f;
            }
             else if (code.equals("MXN")) {
            	convert = inr/4.59f;
            }
             else if (code.equals("0")) {
            	System.out.println();
            	System.out.println("THANK YOU VISIT AGAIN ");
            	return;
            }

            else{
            	System.out.println();
            	System.out.println("INVALID Currency Code i.e "+code);
            	assump= false;
            }

            if (assump) {
            	System.out.println(inr+ "INR : " +convert+ " "+code);
            	
            }

		}
	}
}