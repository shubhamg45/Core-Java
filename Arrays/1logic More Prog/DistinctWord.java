class DistinctWord{
	public static void main(String[] args) {
		
		String str= "hello i am ramesh i am from pune";

		String[]arr=str.split(" ");

		boolean [] trace=new boolean[arr.length];

		for (int i=0,cnt=1;i<arr.length ;i++,cnt=1 ) 
		{
			if (trace[i]) {
				continue;
			}

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i].equals(arr[j])) {
					cnt++;
					trace[j]=true;
				}
			}
			System.out.print(arr[i]+" , ");
		}

	}
}