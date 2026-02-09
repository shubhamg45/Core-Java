class ExceptionHandling3{
	public static void main(String[] args) {
		
	 System.out.println("Starts ");
	 try{
	 	System.out.println("try block ");
	 	Thread.sleep(2000);
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
//      after 2 seconds
//  try block
// ends