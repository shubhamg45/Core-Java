import java.util.Arrays;
class Short3D{
	public static void main(String[] args) {
		
		short [][][]a = new short[2][1][2];


		a[0][0][0]=10 ;
		a[0][0][1]=20 ;

		a[1][0][0]=30 ;
		a[1][0][1]=10 ;

		System.out.println(Arrays.deepToString(a));


	}
}