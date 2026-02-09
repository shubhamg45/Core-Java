class SecondleastEle {
    public static void main(String[] args) {

        int[] arr = {2,3,4,1,5,5,6,7,8,1,1,1,4,3,2,3,3,3};

        boolean[] trace = new boolean[arr.length];
        int minFre=Integer.MAX_VALUE,secMinFre=Integer.MAX_VALUE,minEle=0,secMinEle=0;

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

        	if (cnt < minFre) {
                secMinFre = minFre;
                secMinEle = minEle;

                minFre = cnt;
                minEle = arr[i];
            }
            else if(cnt > minFre && cnt< secMinFre){
            	secMinFre=cnt;
            	secMinEle=arr[i];
            }
        }
        System.out.println(minEle);
        System.out.println(secMinEle);
    }
}
