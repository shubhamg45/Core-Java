class Constructors{
	public static void main(String[] args) {
  //1. public java.lang.String();
		String a=new String();
		System.out.println(a);

		// we can use 
		// " "


  //2. public java.lang.String(java.lang.String);
		//Creates a new String object with the same content as another string
         String z="hello";
		String b=new String(z);
		System.out.println(b);

  //3. public java.lang.String(char[]);
		//Converts a character array into a String.

		char []c={'j','a','v','a'};
		String x=new String(c);
		System.out.println(x);

		    // When working with char-level manipulation
            // Useful in password handling

  //4. public java.lang.String(char[], int, int);
		//Creates a string from a portion of a char array.


		char[] chh = {'J','A','V','A','X'};
		String d=new String(chh,1,2);
		System.out.println(d);


  //5. public java.lang.String(int[], int, int);
		// Creates a String from Unicode code points.
		int []aaa={65,66,67,68,69,70,71} ;
		String e=new String(aaa,2,2);
		System.out.println(e);

		/*
		Notes
             Supports Unicode characters
             Less commonly used
             Introduced for internationalization
		*/

  // public java.lang.String(byte[], int, int, java.nio.charset.Charset);
		//used in modern java ,no platform dependancy
	}
}