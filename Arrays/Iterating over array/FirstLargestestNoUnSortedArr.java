import java.util.Arrays;
class FirstLargestestNoUnSortedArr
{
	public static void main(String[] args) 
	{
		
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) 
		{
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		int max=largest(arr);
		System.out.println(" First Largest Number is : "+max);
	}
	public static int largest(int []arr)
	{
		int large=Integer.MIN_VALUE;
		for (int ele :arr ) 
		{
			if(ele>large)
			{

			large=ele;
		}

     }
     	return large;
   }
}