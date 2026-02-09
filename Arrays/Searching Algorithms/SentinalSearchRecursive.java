import java.util.Arrays;
class SentinalSearchRecursive{
	public static void main(String[] args) 
	{
		int[]arr=new int[20];

		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		int key=22;

		int pos=sentinalSearch(arr,arr.length,key,0,arr[arr.length-1]);
		System.out.println("OutPut  "+key+" : "+pos);


	}                                                        
	public static int sentinalSearch(int []arr,int n, int key,int i,int last)
	{
		      
		arr[n-1]=key;        
		             
		                                
		if (arr[i]!=key)    
		 return sentinalSearch(arr,n,key,++i,last);
		
		arr[n-1]=last;

		     if (i < n - 1 || last == key) return i;
             else return -1;
		     

	}
}