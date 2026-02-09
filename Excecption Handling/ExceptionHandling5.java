class ExceptionHandling5{
	public static void main(String[] args) {
		
	 System.out.println("Starts ");
	 try{
	 	System.out.println("try block ");
	 	Thread.sleep(2000);
	 	System.out.println("try block ");
	 }
	 catch(ArithmeticException a){
	 	System.out.println("InterruptedException handled ");
	 }
	 System.out.println("ends");
	}
}


// RTE InterruptedException occour but try to handled ArithmeticException