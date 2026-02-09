import java.util.*;
class NumberIspresentOrNot{
	public static void main(String[] args) {
		int [] arr={2,3,4,5,6,7,3,3,2,1};
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the Number : ");
		int num=sc.nextInt();

		int i=0,cnt=0;

		while(i<arr.length)
		{
			if(arr[i]==num) 
			 {
			 	cnt++;
			    break;
		     }
		     i++;
		}
		if (arr[i]==num) {
			System.out.println("is present ");
		}
		else{
			System.out.println("Is not Present ");
		}
		
	}
}