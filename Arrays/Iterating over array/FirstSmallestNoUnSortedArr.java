import java.util.Arrays;
class FirstSmallestNoUnSortedArr
{
	public static void main(String[] args) 
	{
		
		int []arr=new int [20];
		for (int i=0;i<arr.length ;i++ ) 
		{
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		int min=smallest(arr);
		System.out.println(" First Smallest Number is : "+min);
	}
	public static int smallest(int []arr)
	{
		int small=Integer.MAX_VALUE;
		for (int ele :arr ) 
		{
			if(ele<small)
			{

			small=ele;
		}

     }
     	return small;
   }
}