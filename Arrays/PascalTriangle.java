import java.util.Arrays;
class PascalTriangle
{
	public static void main(String[] args) 
	{  
      int level=5;
      int[][]arr=new int [level][];   

      for (int size=1;size<=level ;size++ ){
      	arr[size-1]=new int[size];  
      }

      for (int i=0;i<level ;i++ ){
      	for (int j=0;j<arr[i].length ;j++ ){
      		arr[i][j]=1;    
      	}
      }
      for(int i=1;i<level-1;i++){
        for (int j=0;j<arr[i].length-1 ;j++ ){
            arr[i+1][j+1]=arr[i][j]+arr[i][j+1];
        }
      }

      for (int i=0;i<arr.length ;i++ ){
          for (int j=level-1;j>=i ;j-- ) {
              System.out.print(" ");
          }
          for (int j=0;j<arr[i].length ;j++ ) {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }
	}
}