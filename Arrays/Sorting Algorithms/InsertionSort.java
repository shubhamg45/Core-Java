import java.util.Arrays;
class InsertionSort{
	public static void main(String[] args) {
		int []arr={5,1,9,2,8,3,7,4,6,0};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}
	public static void insertionSort(int []arr,int n){
		for (int i=1;i<n ;i++ ) 
		{
			int key=arr[i];
			int j=i-1;

			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}