class Demo{
	static int num = 1;
	public static void main(String[] args) {
		printNumbers();
	}
	public static void printNumbers() {
	System.out.print(num+ " ");
	if(num++ ==100)
		return;

	printNumbers();
	}
}