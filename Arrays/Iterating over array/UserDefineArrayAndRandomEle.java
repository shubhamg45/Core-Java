import java.util.Scanner;
import java.util.Arrays;
class UserDefineArrayAndRandomEle{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size=sc.nextInt();
		int []arr=new int[size];

		for (int i=0;i<size ;i++ ) {
			int randomVal=(int)(Math.random()*100);
			if (randomVal<10) {  // this condition for cheak the ele is 2digit or not 
				i--;
				continue;
			}
			arr[i]=randomVal;
		}
		System.out.println(Arrays.toString(arr));
	}
}