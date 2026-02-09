class IntExam
{
	public static void main(String[] args) {
		int   a = 2147483647;
		int   b = 1;
        int   c = 2147483647 + 1;  //-2147483648

		System.out.println(c);
	}
}