import java.util.Arrays;
class Merge2DArrayIn1D{
	public static void main(String[] args) {
		
		int [][]arr={{1,2,3},{4,5,6},{7,8,9}}; 
         int size=0;
		for (int [] ele :arr ) {
			size+=ele.length;    // get size of 2D array
		}
		
		int []arr2=new int [size]; //new Array creation

		int i=0;
		for (int [] ele :arr )   //iterate on arr 1D
		{
		 	for (int ar : ele)  
		 	{
		 		arr2[i++]=ar;    // add ar(fetch ele) into arr2
		 	}
		 } 
		 System.out.println(Arrays.toString(arr2));
	}
}