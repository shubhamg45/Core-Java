import java.util.Arrays;
class EvenOddIn2DToArr{
	public static void main(String[] args) {
		
		int [][]arr={{1,2,3},{4,5,6},{7,8,9}};   //2D Array

		int ecnt=0,ocnt=0;  // var to take count of even and odd ele

		for (int [] arr1 : arr) {
			for (int ele :arr1) 
			{
				if (ele%2==0) ecnt++;  //even count
				else ocnt++;    // odd count
			}
		}
		int []even=new int[ecnt];  //for Even ele Store
		int []odd=new int[ocnt];   // for Odd ele Store
          

          int ei=0,oi=0;   // var for iteration 
		for (int [] arr1 : arr) {
			for (int ele :arr1) 
			{
				if (ele%2==0) even[ei++]=ele;  // add ele in even array
				else odd[oi++]=ele;   //add ele odd array
			}
		}
		System.out.println("Even Array : "+Arrays.toString(even));    // Even Array : [2, 4, 6, 8]
		System.out.println("Odd Array : "+Arrays.toString(odd));      // Odd Array : [1, 3, 5, 7, 9]

	}
}