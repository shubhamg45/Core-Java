class Examaple2
{
	public static void main(String[] args) 
    {
      
      System.out.println("main Exe Starts");
      evenOdd:
      {
      	System.out.println("evenOdd block Exe Starts");
      	if (5%2==0) {
      		System.out.println("odd");
      		break evenOdd;
      	}
      	else {
      		System.out.println("even");

      	}
      	System.out.println("evenOdd Exe Ends");

      }
      System.out.println("main Exe Ends");

	}
}