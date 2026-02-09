class AvgOfEle{
	public static void main(String[] args) {
		int [] arr={10,20,30,40,50};
         int avg=0;
         int sum=0;
		for (int ele :arr ) {
			sum+=ele;
             
             avg=sum/arr.length;

		}
		System.out.println("Average : "+avg);
	}
}