import java.util.Arrays;
class SecondSmallestNo    // Sorted Array
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
		int min=smallest(arr);
		System.out.println(" Second Smallest Number is : "+min);
	}
	public static int smallest(int []arr)
	{
		int small=arr[0];
		for (int i=1;i<arr.length ;i++ )
		 {
			if (arr[i]!=small) 
				return arr[i];
	     
         }
    return small;

   }
}