import java.util.Scanner;
import java.util.Arrays;
class UserDefineArrayAndEle{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size=sc.nextInt();
		int []arr=new int[size];

		System.out.println("before : "+Arrays.toString(arr));

		for (int i=0;i<size ;i++ ) {
			System.out.print("Enter  : "+(i+1)+" ele : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("After : "+Arrays.toString(arr));
		
	}
}