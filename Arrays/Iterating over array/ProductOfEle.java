class ProductOfEle{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
         int product=1;
		for (int ele :arr ) {
			product*=ele;

		}
		System.out.println("Product : "+product);
	}	
}