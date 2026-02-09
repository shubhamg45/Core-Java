import java.util.Arrays;
class UniqueDuplicateDistinct{
	public static void main(String[] args) {
		int [] arr={1,3,2,3,5,1,9,0,7,6,5,4,9};
		boolean [] trace=new boolean [arr.length];
         int  dup=0,uni=0;
		for(int i=0;i<arr.length;i++){
			if(trace[i]) continue;
			int cnt=1;
			for (int j=i+1;j<arr.length ;j++) {
				if(arr[i]==arr[j]){
					cnt++;
					dup++;
					trace[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
			if(cnt==1){
				uni++;
			}
		}
		int []unique=new int [uni];
		int []distinct=new int [arr.length-dup];
		int []duplicate=new int [dup];

		int l=0,m=0,n=0;

		for (int i=0;i<arr.length;i++ ) {
			if(trace[i]) continue;
			int cnt=1;

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					duplicate[l++]=arr[i];
					cnt++;
				}
			}
			distinct[m++]=arr[i];

			if(cnt==1) unique[n++]=arr[i];
		}
		System.out.println(Arrays.toString(unique));
		System.out.println(Arrays.toString(duplicate));
		System.out.println(Arrays.toString(distinct));

	}
}