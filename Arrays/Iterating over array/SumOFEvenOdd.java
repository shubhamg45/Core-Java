class SumOFEvenOdd{
	public static void main(String[] args) {
		int [] arr={10,21,30,41,50};
		 int evenSum=0;
		 int oddSum=0;

		for (int ele : arr) {
			
			if(ele%2==0){
				evenSum+=ele;
			}
			else{
				oddSum+=ele;
			}
		}
		System.out.println("Even Sum : "+evenSum);
		System.out.println("Odd Sum : "+oddSum);
	}
}