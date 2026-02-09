import java.util.Scanner;
class MethodExample1{
	static int num;
	public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Number : ");
    	 num = sc.nextInt();


    	//if number is valid then block get executes


    	if (checkNumber())
    	 {
    		if (num%2==0) {
    			System.out.println(num+ " is even ");
    			
    		}
    		else {
    			System.out.println(num+" is Odd");
    		}
    		
    	}
    	else
    	{
    		System.out.println("Invalid Number  "+num);
    	}
    }
		public static boolean checkNumber(){
			if(num<=0)
			    return false;
			else
				return true;
		}
	}
