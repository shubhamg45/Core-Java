class Q12
{
	public static void main(String[] args) {
		boolean x = true , y=false;
   //              t || f =true 
		boolean z =!(x && y) || (!x || y);   //true 

		System.out.println(z);
	}
}