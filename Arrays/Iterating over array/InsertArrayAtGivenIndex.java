import java.util.Scanner;
import java.util.Arrays;

class InsertArrayAtGivenIndex{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7};
		int []add={8,9,10};		
		int []ans=insertArrayAtGivenIndex(arr,add,new Scanner(System.in).nextInt());
		System.out.println(Arrays.toString(ans));
	}
	public static int[] insertArrayAtGivenIndex(int [] arr,int [] add,int indx)
	{
		if (indx < 0 || indx > arr.length)
             {
             	System.out.println("Hey User You entered Wrong Index!! i.e : "+indx);
                return arr; // invalid index
             }

        int []ans=new int[arr.length+add.length];

        for (int i=0;i<ans.length ;i++ ) 
        {
        	if (i<indx)
        	{
        		ans[i]=arr[i];
        	}
        	else if (i==indx) {
        		for (int ele :add ) {
        			ans[i++]=ele;
        		}
        		i--;
        	}
        	else{
        		ans[i]=arr[i-add.length];
             	
        }     
      }
      return ans;		

	}
}