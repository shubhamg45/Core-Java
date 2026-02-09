import java.util.Arrays;
class QuickSort{
	public static void main(String[] args) {
		int []arr={5,4,6,3,2,7,1,8,0,9};
		System.out.println("before : "+Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println("after : "+Arrays.toString(arr));
	}
	public static void quickSort(int []arr,int start,int end){
		if(end<start)return;

		int pivotIndx=partition(arr,start,end);  //to find pivot index
		quickSort(arr,start,pivotIndx-1);
		quickSort(arr,pivotIndx+1,end);

	}
	public static int partition(int []arr,int start, int end){
		int pivot=arr[end];  //assume pivot at last index;
		int j=start-1;   

		for (int i=start;i<end ;i++ )   // start to till start<end
		{
			if(arr[i]<pivot)  //array ele in less than pivot
			{
				j++;   // Swaping repalce i with j
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		j++;
		int temp=arr[j];
		arr[j]=arr[end];
		arr[end]=temp;
		return j;

	}
}