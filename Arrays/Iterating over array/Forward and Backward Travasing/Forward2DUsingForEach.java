class Forward2DUsingForEach{
	public static void main(String[] args) {
		
		int [][]arr={{1,2,3},{4,5,6}};

		for (int [] arr1 : arr) {
			for (int ele :arr1) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
}