class Q8
{
	public static void main(String[] args) {
		
		int a = 8;

		 //      9 +  9  + 9  + 9(8)
		int b = ++a + a++ + --a + a--;  // a =8 , b =36 
		System.out.println(a);
		System.out.println(b);
	}
}