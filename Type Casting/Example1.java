class Example1{
	public static void main(String[] args) {
		double a =1;
		short b =(short)a; // Explicitly TypeCasting 
		int c = (int)a; // Explicitly TypeCasting 
		long d=(long)a; // Explicitly TypeCasting 
		float e =(float)a; // Explicitly TypeCasting 
		byte  f=(byte)a;  // Explicitly TypeCasting 
		// boolean g=a;  // Explicitly TypeCasting 
		char h =(char)a; // Explicitly TypeCasting 
		String i=" "+a;
	}
}
class Example2{
	byte a =1;
	short b = a;  // implicit TypeCasting
	int c = a;// implicit TypeCasting
	long d = a;// implicit TypeCasting
	float e  = a;// implicit TypeCasting
	double f = a; // implicit TypeCasting
	// char g = a;  // implicit TypeCasting

}