class Q13
{
	public static void main(String[] args) {
		
		int a = 10 ,b = 5;
           //           10(11)>4(4)  &&  12(12)>4(3)   true && true =true
		boolean result = (a++ > --b)  && (++a > b--);

		System.out.println(a); //12
		System.out.println(b);   // 3
		System.out.println(result);  //true
	}
}