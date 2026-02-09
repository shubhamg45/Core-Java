import java.util.*;
class RotationArrayClockwise{
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int []arr=new int [10];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;
		}
		System.out.println("Before Rotation : "+Arrays.toString(arr));
        System.out.print("Enter the Rotation  : ");
		int rotation=sc.nextInt();
		for (int i=1;i<=rotation ;i++ ) {
			int temp=arr[0];
			for (int j=1;j<arr.length ;j++ ) {
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;

		 System.out.println("After "+i +" Rotation : "+Arrays.toString(arr));

		}
		System.out.println("After completing all Rotation : "+Arrays.toString(arr));

	}
}