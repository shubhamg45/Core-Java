import java.util.Arrays;
class RemoveElement{
	public static void main(String[] args) {
		int []ar={2,3,4,5,6,7,8};
                     //OUTPUT : {2,3,5,6,7,8}
       	int []ans=RemoveElement(4,ar);
       	System.out.println(Arrays.toString(ans));
	}
	public static int [] RemoveElement(int ele,int[]ar)
       {     
            int i;
       	    for (i=0;i<ar.length ;i++ ) 
       	    {
       	    	if (ar[i]==ele) break;
       	    }
       	    if (i < 0 || i >= ar.length)
             {
                return ar; // invalid index
              }
              int [] ans=new int[ar.length-1];

              for (int j=0;j<ar.length;j++ ) 
              {
                  if (j<i) 
                  {
                         ans[j]=ar[j];
                  }
                  else if (j>i)
                  {
                         ans[j-1] = ar[j];

                  }
                  
               }
               return ans;	  
       }            
}