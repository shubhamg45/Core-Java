import java.util.Arrays;
class SecondLargestNoUnSortedArr   
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
		System.out.println(max);
	}
	public static int largest(int []arr)
	{
		int max1=Integer.MIN_VALUE;
		int max2=0;
         
         for (int ele :arr ) {
         	if (max1<ele) {
         		max2=max1;
         		max1=ele;
         	}
         	
         }
         return max2;

   }
}