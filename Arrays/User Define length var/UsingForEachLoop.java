class UsingForEachLoop{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7};
		int len=0;

		for (int ele :arr ) {
			len++;
			// try{
			// 	System.out.println(arr[ele]);
			// }
			// catch(ArrayIndexOutOfBoundsException q){
			// 	break;
			// }
		}
		System.out.println("length : "+len);
	}
}