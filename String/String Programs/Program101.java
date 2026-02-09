class Program101{
	public static void main(String[] args) {
		
		int [][]arr={{1,20},{9,19}};

		for (int []arr1 :arr ) {
			System.out.print(solve(arr1));
		}
	}
	public static int solve(int []arr){
		int start=arr[0],end=arr[1];

		for (;start<=end ;start++ ) {
			System.out.println(start+" ");
		}
		System.out.println();
		return 0;

	}
}