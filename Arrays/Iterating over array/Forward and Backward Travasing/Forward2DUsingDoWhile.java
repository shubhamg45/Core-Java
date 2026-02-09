class Forward2DUsingDoWhile{
	public static void main(String[] args) {
		
		int [][]arr={{1,2,3},{4,5,6}};

		int i=0;
		do{
            int j=0;
			do{
                  System.out.print(arr[i][j]+" ");
                  j++;
			}
			while(j<arr[i].length);
			i++;
			System.out.println();
		}
		while(i<arr.length);
	}
}