import java.util.Arrays;
class PositiveNegativeWithOrder{
	public static void main(String[] args) {
		
		int []arr={2,-9,6,4,-1,7,-8,-3,5};
		
		//op:  [-9, -1, -8, -3, 2, 6, 4, 7, 5]

		int cnt=arr.length;

        for (int i=0;i<cnt ;i++ ) {
            if (arr[i]>0) {
                cnt--;
                int j=i+1;

                while(j<arr.length && arr[j]>0){
                       j++;
                }
                if (j==arr.length) {
                    break;
                }
                int temp=arr[j];
                for (int k=j;k>i ;k-- ) {
                    arr[k]=arr[k-1];
                }
                arr[i]=temp;
            }
      }
    System.out.println(Arrays.toString(arr));
	}
}