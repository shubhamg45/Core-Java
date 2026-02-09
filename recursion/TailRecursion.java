class TailRecursion
{
	public static void main(String[] args) {
	m1((char)('A'));
	}
	public static void m1(char ch)
	{
		m1(ch++);
		System.out.print(ch+ " ");
		if(ch=='Z')
			return;
	}
}