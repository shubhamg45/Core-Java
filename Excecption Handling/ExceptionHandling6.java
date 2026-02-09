class ExceptionHandling6{
	public static void main(String[] args) {
		
	 System.out.println("Starts ");
	 try{
	 	System.out.println("try block ");
	 	Thread.sleep(10/0);
	 	System.out.println("try block ");
	 }
	 catch(InterruptedException a){
	 	System.out.println("InterruptedException handled ");
	 }
	 System.out.println("ends");
	}
}

// Starts
// try block
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at ExceptionHandling6.main(ExceptionHandling6.java:7)
