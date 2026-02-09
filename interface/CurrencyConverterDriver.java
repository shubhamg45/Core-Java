interface Currency{
	double USD=88.59; //us doller
	double EUR=102.67; //Euro
	double GBP=116.36; //British pound
	double JPY=0.57; //japanise yen
	double AUD=57.89; //Aus doller

	void inUsDoller(double inr);
	void inEuro(double inr);
	void inBritishPound(double inr);
	void inJapaniseYen(double inr);
	void inAusDoller(double inr);

}
class CurrencyConvertImp implements Currency{

	public void inUsDoller(double inr){

		double usDoller=inr/USD;
		System.out.println("USD : "+usDoller);
	}
	public void inEuro(double inr){

		double euro=inr/EUR;
		System.out.println("EUR : "+euro);

	}
	public void inBritishPound(double inr){

		double britishPound=inr/GBP;
		System.out.println("GBP : "+britishPound);

	}
	public void inJapaniseYen(double inr){

		double japaniseYen=inr/JPY;
		System.out.println("JPY : "+japaniseYen);

	}
	public void inAusDoller(double inr){

		double ausDoller=inr/AUD;
		System.out.println("AUD : "+ausDoller);


	}	


}
class CurrencyConverterDriver{
	public static void main(String[] args) {
		Currency obj=new CurrencyConvertImp();
		obj.inUsDoller(100);
		obj.inEuro(100);
		obj.inBritishPound(100);
		obj.inJapaniseYen(100);
		obj.inAusDoller(100);

		
	}
}