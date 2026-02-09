import java.util.Arrays;
class AddElementAtIndex{
	public static void main(String[] args) {
		int []ar={2,3,4,5,6,7,8};
       	int []ans=addEleAtIndex(4,ar,55);//(indx,array,element)
       	System.out.println(Arrays.toString(ans));	
	}
	public static int [] addEleAtIndex(int indx,int[]ar,int ele)
	{
        if (indx < 0 || indx >= ar.length)
        {
           return ar; // invalid index return as it is OG array
        }
        int [] ans=new int[ar.length+1];

        for (int i=0;i<ans.length;i++ ) {
        	if (i>indx) {
        		ans[indx]=ele;
        		ans[i]=ar[i-1];
        	}
        	else {
        		ans[i]=ar[i];
        	}
        }
        return ans;
	}
}