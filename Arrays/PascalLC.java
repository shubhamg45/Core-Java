import java.util.*;
class PascalLC
{
	public static void main(String[] args) {
		
        int numRows = 5;
        int[][] result = generate(numRows);

        // Print Pascal's Triangle
            for (int i=0;i<result.length ;i++ )
      {
          for (int j=numRows-1;j>=i ;j-- ) {
              System.out.print(" ");
          }
          for (int j=0;j<result[i].length ;j++ ) {
              System.out.print(result[i][j]+" ");
          }
          System.out.println();
      }


	}
	    public static int[][] generate(int numRows) {

        int[][] arr = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            arr[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {

                // First and last element
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    // Middle elements
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
     
        }
        return arr;
    }
}