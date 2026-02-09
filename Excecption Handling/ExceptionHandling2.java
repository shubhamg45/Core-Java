class ExceptionHandling2{
	public static void main(String[] args) {
		
		System.out.println("start");
		try{
			System.out.println("hello".charAt(6));
		}
		catch(ArrayIndexOutOfBoundsException i){
			System.out.println("Exaception handled");
		}
		// here we get runtime StringIndexOutOfBoundsException
		// but we handling  ArrayIndexOutOfBoundsException 
		System.out.println("Ends");
	}
}