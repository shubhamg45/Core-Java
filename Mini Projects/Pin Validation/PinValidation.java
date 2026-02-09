import java.util.Scanner;
class PinValidation
{
	public static void main(String[] args) throws InterruptedException
	{
		int storePin=1234;
		int duration=5000;

		outerLoop :   //label (indentifier->variable)
		for (; ; ) 
		{
			int attempt = 3;
			do{
				System.out.println();
				System.out.print("Enter your pin : ");
				int userPin=new java.util.Scanner(System.in).nextInt();

				if(storePin==userPin)
				{
					System.out.println("Phone Unlocked ");
					break outerLoop;
				}
				else
				{
					System.out.println("Wrong Pin ");
					System.out.println("Attempt Left "+(attempt-1));
				}
				attempt--;
			}
			while(attempt!=0); //condition

			System.out.println();
			System.out.println("Phone is Diasabled for "+(duration/1000)+ " seconds");
			Thread.sleep(duration);
			duration*=2;
		}
	}
}