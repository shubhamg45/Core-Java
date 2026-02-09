class Example2DUsingForEach{
	public static void main(String[] args) {
		
		int [][]arr={{10,20,30},{40,50},{60,70,80}};

		for (int [] arr1 :arr ) {
			for (int ele :arr1 ) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
}