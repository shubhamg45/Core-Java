
import java.util.Arrays;
class LinearSearchIterative{
	public static void main(String[] args) {
		
		int[]arr=new int[20];

		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		int key=21;

		int pos=linearSearch(arr,arr.length,key);
		System.out.println("OutPut : "+key+" : "+pos);
	}
	public static int linearSearch(int[]arr,int n,int key){

		for (int i=0;i<n ;i++ ) {
			if (arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
