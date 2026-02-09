class Example2DUsingDoWhile{
	public static void main(String[] args) {
		
		int [][] arr={{10,20,30},{40,50},{60,70,80}};

         
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