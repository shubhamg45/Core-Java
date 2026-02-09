class Methods{
	public static void main(String[] args) {
		String str="He😀llo Java";

		// Returns the length of this string and it always counts the whitespaces also.
		System.out.println(str.length());

		//Returns true if, and only if, length() is 0.
		System.out.println(str.isEmpty());
        
        //Returns the char value at the specified index.
		System.out.println(str.charAt(0));

        //Returns the Ascii value of character at the specified index.
		System.out.println(str.codePointAt(0));

        //Returns the Ascii value of character before the specified index.
		System.out.println(str.codePointBefore(4));

        //Returns the number of Unicode code points in the specified text range of this String.
		System.out.println(str.codePointCount(1, 4));

		System.out.println(str.offsetByCodePoints(1,4));

        char []a={'a','e','e','o','u','b','c','d'};
		System.out.println(str.getChars(1,2,a,4));

	
	}
}