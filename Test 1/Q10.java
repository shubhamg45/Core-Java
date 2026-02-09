class Q10
{
	public static void main(String[] args) {
		boolean a = true,b=false;
   //              false||false == false  && true == false || true = true 
		boolean c = !a || b && a || !b;  //true

		System.out.println(c); // true
	}
}