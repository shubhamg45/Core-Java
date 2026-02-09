class Example2DUsingWhile{
	public static void main(String[] args) {
		
		int [][] arr={{10,20,30},{40,50},{60,70,80}};

		int i=0;
		while (i<arr.length) {
			int j=0;
			while (j<arr[i].length) {
				System.out.print(arr[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}