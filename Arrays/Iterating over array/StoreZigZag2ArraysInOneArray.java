import java.util.Arrays;
class StoreZigZag2ArraysInOneArray{
	public static void main(String[] args) {

		int []a={1,2,3,4,5,6};
		int []b={7,8,9,10,11,12,13,14};

		int []c =new int[a.length+b.length];

		int maxLength=a.length<b.length?b.length:a.length;

		for(int i=0,ci=0;i<maxLength;i++){
               
               if (i<a.length) {
               		c[ci++]=a[i];
               	}
               	if (i<b.length) {
               	   c[ci++]=b[i];
               	}
             
		}
		System.out.println(Arrays.toString(c));

	}
}
//  [1, 7, 2, 8, 3, 9, 4, 10, 5, 11, 6, 12, 13, 14]