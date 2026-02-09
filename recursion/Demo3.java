class Demo3
{
	public static void main(String[] args) 
	{
		printNumbers(1);
	}
	public static void printNumbers(int num) {

		System.out.print(num);
		if (num==100) return;
		printNumbers(++num);
		
	}
}