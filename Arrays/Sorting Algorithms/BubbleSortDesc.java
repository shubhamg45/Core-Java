// for sort in descending order
import java.util.Arrays;
class BubbleSortAsc{
	public static void main(String[] args) {
		
		int []ar={1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before Bubble Sort : "+Arrays.toString(ar));

        for (int i=0,pass=0;i<ar.length-1 ;i++ ) 
        {
        	for (int j=0;j<ar.length-1-i ;j++ )  
        	{
        		if (ar[j]<ar[j+1]) 
        		{
        			int temp=ar[j];
        			ar[j]=ar[j+1];
        			ar[j+1]=temp;
        		}
        	}
        }
		System.out.println("After Bubble Sort : "+Arrays.toString(ar));
	}
}