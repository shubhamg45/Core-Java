import java.util.Arrays;
class ExplicitlyMain
{
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(Arrays.toString(args));
		m1(10);
	}
	public static void m1(int num )
	{
		System.out.println("m1 ()");
		String [] args={"hello"};
	}
}