class ForExample4
{
	public static void main(String[] args) {
		
		for (char ch = 'A';ch<='Z' ;ch+=2 ) {
			System.out.print(ch+ " ");
			
		}
		System.out.println();
		System.out.println();

		int j =1;
		for (char ch = 'A';ch<='Z' ;ch+=j) {
			
			System.out.print(ch+ " ");
			j++;
			
		}
	}
}