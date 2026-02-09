// 
class PalindromeName
{
	public static void main(String[] args) {
		 String str=args[0];
		String op=palindrome(str);
		if (str.equals(op)) {
			System.out.println("its Palindrome");
		}
		else{
			System.out.println("its Not Palindrome");   
		}
	}
	public static String palindrome(String str)
	{
		String rev="";

		for (int i=str.length()-1;i>=0 ;i--) 
		{
			rev+=str.charAt(i);
		}
		return rev;

	}
}