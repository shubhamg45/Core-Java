import java.util.Arrays;
class TernarySearchIterativeRecursive{
	public static void main(String[] args) 
	{
		int []arr=new int[20];
		for (int i=0;i<arr.length ;i++ ) arr[i]=i+1;
		System.out.println(Arrays.toString(arr));

		int k=11;

		int pos1=ternarySearchIterative(arr,arr.length-1,k);
		System.out.println(k+" : "+pos1);

	    int pos2=ternarySearchRecursive(arr,0,arr.length-1,k);
		System.out.println(k+" : "+pos2);
	}
	public static int ternarySearchIterative(int[]arr,int n,int k)
	{
		int low=0;
		int high=n;

		while(low<=high)
		{
			int mid1=low+(high-low)/3;
			int mid2=high-(high-low)/3;

			if(arr[mid1]==k) return mid1;
			if(arr[mid2]==k) return mid2;

			if(k<arr[mid1]) high=mid1-1;
			else if (k>arr[mid2]) low=mid2+1;
			else{
				low=mid1+1;
				high=mid2-1;
			}
		}
		return -1;
	}
	public static int ternarySearchRecursive(int[]arr,int low,int high,int k)
	{
		if(low>high) return -1;
			int mid1=low+(high-low)/3;
			int mid2=high-(high-low)/3;

			if(arr[mid1]==k) return mid1;
			if(arr[mid2]==k) return mid2;

			if(k<arr[mid1])  return ternarySearchRecursive(arr,low,mid1-1,k);
			else if (k>arr[mid2])  return ternarySearchRecursive(arr,mid2+1,high,k); 
			else  return ternarySearchRecursive(arr,mid1+1,mid2-1,k);
	}
}