import java.util.Arrays;
class SelectionSort{
	public static void main(String[] args) {
		int [] arr={8,3,7,9,2,0,6,4,5,1};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("Sort : "+Arrays.toString(arr));
	}
	public static void selectionSort(int [] arr,int n){
		for (int i=0;i<n-1 ;i++ ) 
		{
			int min=i;
			for (int j=i+1;j<n ;j++ ) 
			{
				if(arr[min]>=arr[j])   //<make desc order
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
}