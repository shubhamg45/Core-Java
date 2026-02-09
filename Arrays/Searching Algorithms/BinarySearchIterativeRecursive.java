import java.util.Arrays;
class BinarySearchIterativeRecursive{
	public static void main(String[] args) {
		
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) 
			arr[i]=(int)(Math.random()*100);


		int key= 21;

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int pos1=binarySearchRecursive(arr,0,arr.length-1,key);
		System.out.println(key+" : "+pos1);

		int pos2=binarySearchIterative(arr,arr.length-1,key);
		System.out.println(key+" : "+pos2);
	}
	public static int binarySearchRecursive(int []arr,int min,int max,int key)
	{

		if (min>max)  return -1;
		int mid=(max+min)/2;

		if(arr[mid]==key) return mid;
		else if(key<arr[mid])  return  binarySearchRecursive(arr,min,mid-1,key);
		else return binarySearchRecursive(arr,mid+1,max,key);
	}
	public static int binarySearchIterative(int []arr,int n,int key)
	{
		int min=0,max=n-1;

		while(min<max)
		{
			int mid=(min+max)/2;

			if (arr[mid]==key) return mid;
			else if(key<arr[mid])  max=mid-1;
			else  min=mid+1;
		}
		return -1;
	}
}