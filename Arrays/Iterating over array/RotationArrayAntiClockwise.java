import java.util.*;
class RotationArrayAntiClockwise{
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		int []arr=new int [10];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;
		}
		System.out.println("Before Rotation : "+Arrays.toString(arr));
        System.out.print("Enter the Rotation  : ");
		int rotation=sc.nextInt();

		antiClockWiseRotation(arr,rotation);
		System.out.println("After completing all Rotation : "+Arrays.toString(arr));

	}
	public static void antiClockWiseRotation(int []arr,int rotation){
		for (int i=1;i<=rotation ;i++ ) {
			int temp=arr[arr.length-1];
			for (int j=arr.length-2;j>=0 ;j-- ) {
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
		    System.out.println("After "+i +" Rotation : "+Arrays.toString(arr));

		}
	}
}