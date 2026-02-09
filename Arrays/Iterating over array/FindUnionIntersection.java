import java.util.Arrays;
class FindUnionIntersection{
	public static void main(String[] args) 
	{
		int [] arr1={10,20,30,40,50};
		int [] arr2={40,10,100,90};

		int [] union=findUnion(arr1,arr2);
		System.out.println("UNION : "+Arrays.toString(union));
		int [] intersection=findIntersection(arr1,arr2);
		System.out.println("INTERSECTION : "+Arrays.toString(intersection));
	}
	public static int[] findUnion(int []arr1,int []arr2)
	{
		int ctOfCommon=countOfCommon(arr1,arr2);

		int[] ans=new int [(arr1.length+arr2.length)-ctOfCommon];

		int i;

		for (i=0;i<arr1.length ;i++ ) {
			ans[i]=arr1[i];
		}
		for (int j=0;j<arr2.length ;j++ ) {
			if(!contains(arr1,arr2[j])){
				ans[i]=arr2[j];
				i++;
			}
		}
          return ans;
	   
	}
	public static int[] findIntersection(int []arr1,int []arr2)
	{
		int ctOfCommon=countOfCommon(arr1,arr2);
		int[] ans=new int [ctOfCommon];

		int j=0;

		for (int i=0;i<arr1.length ;i++ ) {
			if (contains(arr2,arr1[i])) {
				ans[j++]=arr1[i];
			}
		}
		return ans;

	}
	public static int countOfCommon(int []arr1,int []arr2)
	{
		int ctOfCommon=0;
		if (arr1.length<arr2.length) 
		{
			for (int i=0;i<arr1.length ;i++ ) {
				if (contains(arr2,arr1[i])) {
					ctOfCommon++;
				}
			}
		}
		else{
			for (int i=0;i<arr2.length ;i++ ) {
				if (contains(arr1,arr2[i])) {
					ctOfCommon++;
				}
			}

		}
		return ctOfCommon;
	}
	 public static boolean contains(int []ar1,int ele)
	 {
	 	for (int i=0;i<ar1.length ;i++ ) {
	 		if(ar1[i]==ele){
	 			return true;
	 		}
	 	}
	 	return false;
	 }
}