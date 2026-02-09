import java.util.Arrays;
class Merge2DifferentArrayIn1DL1{
	public static void main(String[] args) {
		
		int []a={1,2,3,4,5,6};
		int []b={7,8,9,10,11,12,13,14};
		
		int []c=new int[a.length+b.length];


		for (int i=0,ci=0;i<c.length;i++ ) {
		if (i<a.length	) {
			c[i]=a[i];
		}
		else {
			c[i]=b[ci++];
		}
	}
		System.out.println("C : "+Arrays.toString(c));
	}
}