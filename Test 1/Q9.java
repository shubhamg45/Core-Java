class Q9
{
	public static void main(String[] args) {
		
		int x = 3, y= 4;

        //       4(4) *4(3)  + 4(5) * 4(4) ans  x = 5, y= 4 z= 32
		int z = ++x*y-- + x++*++y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}