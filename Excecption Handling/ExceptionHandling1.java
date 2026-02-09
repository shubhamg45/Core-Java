class ExceptionHandling1{
	public static void main(String[] args) {
		
		System.out.println("start");
		try{
			System.out.println("hello".charAt(6));
		}
		catch(IndexOutOfBoundsException i){
			System.out.println("Exaception handled");
		}
		System.out.println("Ends");
	}
}