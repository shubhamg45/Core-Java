class WhileExample3
{
	public static void main(String[] args) {
		int j=1;
		char ch='A';
		while (ch<='Z') {
			System.out.print(ch+" ");
			j++;
			ch+=j;
			
			
		}
	}
}