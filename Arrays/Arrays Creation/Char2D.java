import java.util.Arrays;
class Char2D{
	public static void main(String[] args) {
	
	char [][] a=new char [2][];
             a[0]=new char[2];
             a[1]=new char[3];


    a[0][0]='a';
    a[0][1]='b';
    a[1][0]='c';
    a[1][1]='d';
    a[1][2]='e';
    System.out.println(Arrays.deepToString(a));

	}
}