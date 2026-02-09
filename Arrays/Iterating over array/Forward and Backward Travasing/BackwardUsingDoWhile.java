class BackwardUsingDoWhile{
	public static void main(String[] args) {
		
		int [] arr={10,20,30,40,50};
		int i=arr.length-1;
		do{
			System.out.print(arr[i--]+" ");
		}
		while(i>=0);
	}
}