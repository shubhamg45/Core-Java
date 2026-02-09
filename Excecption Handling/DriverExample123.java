class DriverExample123{
	public static void main(String[] args) {
		
		for (int i=1;i<=5 ;i++ ) {
			try{
				System.out.println("try");
				System.out.println(10/0);
			}
			catch(ArithmeticException e){
				System.out.println("Catch");
				for (; ; );
			}
			finally{
				System.out.println("Finally ");
			}
		}
	}
}