class DriverExample1234{
	public static void main(String[] args) {
		
		for (int i=1;i<=5 ;i++ ) {
			try{
				System.out.println("try");
				System.out.println(10/0);
			}
			catch(ArithmeticException e){
				System.out.println("Catch");
			    System.exit(0);
			}
			finally{
				System.out.println("Finally ");
			}
		}
	}
}