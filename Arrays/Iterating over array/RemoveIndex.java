import java.util.Arrays;
class RemoveIndex{
       public static void main(String[] args) {
       	int []ar={2,3,4,5,6,7,8};
                     //OUTPUT : {2,3,4,5,7,8}
       	int []ans=removeIndex(4,ar);
       	System.out.println(Arrays.toString(ans));
       }
       public static int [] removeIndex(int indx,int[]ar)
       {
            if (indx < 0 || indx >= ar.length)
             {
                return ar; // invalid index
              }
              int [] ans=new int[ar.length-1];

              for (int i=0;i<ar.length;i++ ) 
              {
                  if (i<indx) 
                  {
                         ans[i]=ar[i];
                  }
                  else if (i>indx)
                  {
                         ans[i-1] = ar[i];
                  }
                  
               }
               return ans;
       }            
}