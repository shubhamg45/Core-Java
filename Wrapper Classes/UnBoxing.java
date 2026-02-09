//Converting Non primitive type of data into primitive Type
class UnBoxing{
	public static void main(String[] args) {

		Byte b =new Byte((byte)10);   
		long val1=b.byteValue();
		System.out.println(val1);

		Short s =new Short((short)20);
		short val2=s.shortValue();
		System.out.println(val2);

		Integer i=new Integer(30);
		int val3=i.intValue();
		System.out.println(val3);

		Long l =new Long(10);
		long val4=l.longValue();
		System.out.println(val4);

		Float f=new Float(10.2f);
		float val5=f.floatValue();
		System.out.println(val5);

		Double d=new Double(15.4);
		double val6=d.doubleValue();
		System.out.println(val6);


		Character c =new Character('s');
		char val7=c.charValue();
		System.out.println(val7);

		Boolean bool=new Boolean(false);
		boolean val8=bool.booleanValue();
		System.out.println(val8);

		
	}
}