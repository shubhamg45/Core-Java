import java.util.Arrays;
class Int3D1{
	public static void main(String[] args) {
		

		int [][][]a=new int [2][][];
		a[0]=new int [2][3];
		a[1]=new int[1][5];

		a[0][0][0]=1;
		a[0][0][1]=2;
		a[0][0][2]=3;
		a[0][1][0]=4;
		a[0][1][1]=5;
		a[0][1][2]=6;
		a[1][0][0]=7;
		a[1][0][1]=8;
		a[1][0][2]=9;
		a[1][0][3]=10;
		a[1][0][4]=11;

		System.out.println(Arrays.deepToString(a));

	}
}