import java.util.Arrays;
class BubbleSortIterativeRecursive{
	public static void main(String[] args) {
		
		int [] arr={2,4,1,5,8,3};
		System.out.println(Arrays.toString(arr));

		bubbleSortIterative(arr,arr.length);
		System.out.println("Sorted using Iterative  : "+Arrays.toString(arr));

		bubbleSortRecursive(0,arr,arr.length);
		System.out.println("Sorted using Recursion : "+Arrays.toString(arr));
	}
	public static void bubbleSortIterative(int []arr,int n){

		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if(arr[i]>=arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void bubbleSortRecursive(int i,int [] arr,int n)
	{
		if(i>n-1) return;
		innerIteration(i+1,arr,i,n);
		bubbleSortRecursive(++i,arr,n);

	}
	public static void innerIteration(int j,int []arr,int i,int n){
		if(j>n-1) return;
		if (arr[i]>=arr[j]) 
		{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
}