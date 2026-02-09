class LengthWithoutLengthVar{
	public static void main(String[] args) {
		
		int []arr={1,2,3,4,5,6,7,8,9,10};
		int len=0;

		for (int i : arr) {
			len++;
		}
		System.out.println("length of Arrays is : "+len);
	}
}