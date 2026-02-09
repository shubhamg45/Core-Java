class DoWhile2
{
	public static void main(String[] args) {
		 int j=1;
		char ch='A';
		do{
			System.out.print( ch + " " );
			j++;
			ch+=j;
		}
		while(ch<='Z');
	}
}