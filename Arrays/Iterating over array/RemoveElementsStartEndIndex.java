import java.util.Scanner;
import java.util.Arrays;
class RemoveElementsStartEndIndex{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7};
		int []ans=removeElements(arr,new Scanner(System.in).nextInt(),
			new Scanner(System.in).nextInt());
		System.out.println(Arrays.toString(ans));
	}
	public static int [] removeElements(int []arr,int si,int ei)
	{
          if (si>ei ||si<0||ei>=arr.length) {
          	System.out.println("you enters wrong Start or  end index ");
          	return arr;
          }
         int []ans=new int[arr.length-1-(ei-si)];
         System.out.println("the length of new Array is : "+ans.length);
         for (int i=0;i<ans.length ; ) 
         {
         	if(i<si){
                 ans[i]=arr[i];
                 i++;
         	}
         	else if(i==si){
                 i=ei;
         	}
         	else{
         	 ans[i-(ei-si)]=arr[i];
         	 i++;
         	}
         }
         return ans;
	}
}