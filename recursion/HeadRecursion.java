class HeadRecursion
{
	public static void main(String[] args) {
		m1((char)('Z'+1));
	}
	public static void m1(char ch)
	{
		if(ch=='A')
			return;
		m1(--ch);
		System.out.print(ch+ " ");
	}
}