import java.util.Arrays;
class SecondLargestNo   //sorted Array
{
	public static void main(String[] args) 
	{
		
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) 
		{
			arr[i]=(int)(Math.random()*100);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int max=largest(arr);
		System.out.println(max);
	}
	public static int largest(int []arr)
	{
		int large=arr[arr.length-1];
		for (int i=arr.length-2;i>=0 ;i-- )
		 {
			if (arr[i]!=large) 
				return arr[i];
	     
         }
    return large;

   }
}