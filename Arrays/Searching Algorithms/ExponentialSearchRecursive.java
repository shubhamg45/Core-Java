import java.util.Arrays;
class ExponentialSearchRecursive{
	public static void main(String[] args) 
	{
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;   
		}

		int k=9;       
		int pos=exponentialSearch(arr,arr.length-1,k,1);     
		System.out.println(k+" : "+pos);          // gets output
	}
	public static int exponentialSearch(int[]arr,int n,int k,int i)
	{
		if (arr[0]==k) return 0;       


		if(i<n && k>arr[i])  return exponentialSearch(arr,n,k,i*2);

		return binarySearch(arr,k,i/2,Math.min(n,i)); 
	}
	public static int binarySearch(int []arr,int k,int low ,int high)
	{
		while(low<=high)  
		{
			int mid=(high+low)/2;
			if (k==arr[mid]) return mid;
			else if (k<arr[mid]) high=mid-1;
			else low=mid+1;
		}
		return -1;
	}
}