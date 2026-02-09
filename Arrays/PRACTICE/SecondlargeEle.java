class SecondlargeEle{
	public static void main(String[] args) {

		int[] arr = {2,3,4,1,5,5,6,7,8,1,1,1,4,3,2,3,3,3};

        boolean[] trace = new boolean[arr.length];
        int maxFre=Integer.MIN_VALUE,secMaxFre=Integer.MIN_VALUE,maxEle=0,secMaxEle=0;

        for (int i=0;i<arr.length ;i++ ) {
        	if(trace[i]) continue;
        	int cnt=1;

        	for (int j=i+1;j<arr.length ;j++ ) {
        		if(arr[i]==arr[j]){
        			cnt++;
        			trace[j]=true;
        		}
        	}
        	System.out.println(arr[i]+" : "+cnt);

        	if(cnt>maxFre){
        		secMaxFre=maxFre;
        		maxFre=cnt;
        		secMaxEle=maxEle;
        		maxEle=arr[i];
        	}
        	else if(cnt< maxFre && cnt>secMaxFre){
        		secMaxFre=cnt;
        		secMaxEle=arr[i];
        	}
        }
        System.out.println(maxEle);
        System.out.println(secMaxEle);
	}
}