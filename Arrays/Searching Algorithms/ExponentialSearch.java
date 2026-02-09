import java.util.Arrays;
class ExponentialSearch{
	public static void main(String[] args) 
	{
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;    // Filling the array with sorted values from 1 to 20
		}

		int k=9;          // Element to be search

		int pos=exponentialSearch(arr,arr.length-1,k);      // call the method
		System.out.println(k+" : "+pos);          // gets output
	}
	public static int exponentialSearch(int[]arr,int n,int k)
	{
		if (arr[0]==k) return 0;       // k is present at 0th index return

		int i=1;      // start point of loop

		while(i<n && k>arr[i])       // loop run till cond is true
		{
			i*=2;          // we get search points
		}
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