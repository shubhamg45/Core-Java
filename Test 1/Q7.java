class Q7
{
	public static void main(String[] args) {
		
		int i = 5;
      //         5   + 7   + 7  + 5(5)
		int j = i++ + ++i + i-- + --i;  // i = 5, j= 24
		System.out.println(i);
		System.out.println(j);
	}
}