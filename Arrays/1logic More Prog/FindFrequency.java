import java.util.Arrays;
class FindFrequency{
	public static void main(String[] args) {
		
		int [] arr={1,2,3,2,1,4,5,3,6,7,8,6,5,4,9,5};
		boolean [] trace=new boolean[arr.length];
       int unic=0;int cnt=1;
		for (int i=0;i<arr.length ;i++ ) {
			if (trace[i]) continue;
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					trace[j]=true;
				}
			}
			
			if(cnt==1){
				unic++;
			}
		}
		int [] uniq=new int [unic];
		for (int i=0;i<uniq.length ;i++ ) {
			if(cnt==1){
				uniq[i]=arr[i];
			}
		}System.out.println(Arrays.toString(uniq));
	}
}