class ForExample2
{
	public static void main(String[] args) 
	{
		// 1 to 100
		for (int i =1;i<=100 ;i++ ) {

			System.out.print(i+ " ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		// 100 to 1

		for (int i =100;i>=1 ;i-- ) {

			System.out.print(i+ " ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		//0 to 127 Ascii Values 

		for (char ch = 0 ;ch<=127 ;ch++ ) {

			System.out.print(ch+ " ");
			
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		// A to Z  a - z  0 to 9

		for (char ch = 0;ch<=127 ;ch++ ) {

			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>=48 && ch<=57)
				System.out.print(ch+ " ");
			
		}
		System.out.println();
		System.out.println();

		for (char ch = 0;ch<=127 ;ch++ ) {

			if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>=48 && ch<=57))
				System.out.print(ch+ " ");
			
		}
		System.out.println();
		System.out.println();

		for (char ch = 'Z';ch<='A' ;ch++ ) 
		{
			System.out.print(ch+" ");
			
		}


		
	}
}