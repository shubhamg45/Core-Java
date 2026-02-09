// Converting primitive type of data into Non primitive Type
class Boxing{
	public static void main(String[] args) {
		
		byte val1=10;
		Byte b=new Byte(val1);
		System.out.println(b); // here we can see toString() Object Class Overrided

        short val2=20;
        Short s=new Short(val2);
        System.out.println(s);

		int val3=30;
		Integer i=new Integer(val3);
		System.out.println(i); 

		long val4=40;
		Long l=new Long(val4);
		System.out.println(l);

		float val5=12.4f;
		Float f=new Float(val5);
		System.out.println(f);

		double val6=123.12;
		Double d=new Double(val6);
		System.out.println(d);

		char val7='a';
		Character c =new Character(val7);
		System.out.println(c);

		boolean val8=true;
		Boolean bool=new Boolean(val8);
		System.out.println(bool);

	}
}