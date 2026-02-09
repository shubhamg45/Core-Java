class Q11
{
	public static void main(String[] args) {
		boolean p = true,q=false, r=false;
   //                f       &&f == f  || t= true 
		boolean s = !(p||q) && r || !(p&&r);  //true

		System.out.println(s); 
	}
}