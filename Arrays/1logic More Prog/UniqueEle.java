class UniqueEle{
	public static void main(String[] args) {

	    int [] arr={2,3,4,1,5,5,6,7,8,1,1,1,1,4,3,2};

		boolean [] trace=new boolean[arr.length];

		for (int i=0,cnt=1;i<arr.length ;i++,cnt=1 ) 
		{
			if (trace[i]) {
				continue;
			}

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					trace[j]=true;
				}
			}
			
			if (cnt==1) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}