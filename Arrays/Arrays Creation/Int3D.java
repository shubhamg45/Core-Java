import java.util.Arrays;
class Int3D{
	public static void main(String[] args) {
		
		int [][][]a=new int [1][3][2];

		a[0][0][0]=10;
		a[0][0][1]=20;
		a[0][1][0]=30;
		a[0][1][1]=40;
		a[0][2][0]=50;
		a[0][2][1]=60;

		System.out.println(Arrays.deepToString(a));


	}
}