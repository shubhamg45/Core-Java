import java.util.regex.*;
class Compile{
	public static void main(String[] args) {
		Pattern pattern =Pattern.compile("abc");
		Matcher m1 = pattern.matcher("abc");
		Matcher m2 = pattern.matcher("abcdefg");
		System.out.println(m1.matches());
		System.out.println(m2.matches());

		// another
		Pattern pattern1 =Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		Matcher match1=pattern1.matcher("java is high level lang , JAVA is easy");

		while(match1.find()){
			System.out.println(match1.group()+" : "+match1.start()+" , "+match1.end());
		} 
	}
}