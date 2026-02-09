import java.util.Arrays;
class Reverse1DArray{
	public static void main(String[] args) {
		int []b={7,8,9,10,11,12,13,14};
		
		for (int i=0,j=b.length-1;i<b.length/2 ;i++,j-- ) {
			int temp=b[i];
			b[i]=b[j];
			b[j]=temp;
		}
		System.out.println(Arrays.toString(b));
	}
}