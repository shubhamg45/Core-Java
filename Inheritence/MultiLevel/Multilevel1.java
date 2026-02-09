class Country{
	private String name; 
	private String capital;
	private String language;
	private String primeMinister;
    private double area;
    private long population;
    private char currency;

    Country(String name, String capital, String language, String primeMinister,
            double area, long population, char currency){
    	this.name = name;
        this.capital = capital;
        this.language = language;
        this.primeMinister = primeMinister;
        this.area = area;
        this.population = population;
        this.currency = currency;
    }
    public void getCountryInfo(){
    	System.out.println("\n--- Country Information ---");
        System.out.println("Country Name : " + name);
        System.out.println("Capital : " + capital);
        System.out.println("Language : " + language);
        System.out.println("Prime Minister : " + primeMinister);
        System.out.println("Area : " + area + " sq km");
        System.out.println("Population : " + population);
        System.out.println("Currency Symbol : " + currency);
    }
}
class State extends Country{
	private String stateName;
	private String stateCapital;
	private String stateLanguage;
	private String stateCM;
    private double stateArea;
    private long statePopulation;
    private int districts;

    State(String name, String capital, String language, String primeMinister,double area, long population, char currency,
          String stateName, String stateCapital, String stateLanguage, String stateCM, double stateArea, long statePopulation, int districts){
    	super(name, capital, language, primeMinister, area, population, currency);
    	this.stateName = stateName;
        this.stateCapital = stateCapital;
        this.stateLanguage = stateLanguage;
        this.stateCM = stateCM;
        this.stateArea = stateArea;
        this.statePopulation = statePopulation;
        this.districts = districts;

    }
    public void getStateInfo(){
    	System.out.println("\n--- State Information ---");
        System.out.println("State Name : " + stateName);
        System.out.println("Capital : " + stateCapital);
        System.out.println("Language : " + stateLanguage);
        System.out.println("Chief Minister : " + stateCM);
        System.out.println("Area : " + stateArea + " sq km");
        System.out.println("Population : " + statePopulation);
        System.out.println("Districts : " + districts);
    }
}
class District extends State{
	private String districtName;
	private String municipalCommission;
    private long districtPopulation;
    private double districtArea;
    private int noOfMP;

    District(String name, String capital, String language, String primeMinister,double area, long population, char currency,
          String stateName, String stateCapital, String stateLanguage, String stateCM, double stateArea, long statePopulation, int districts,
           String districtName, String municipalCommission, long districtPopulation,double districtArea, int noOfMP){

    	super(name, capital, language, primeMinister, area, population, currency,
    		stateName, stateCapital, stateLanguage, stateCM,stateArea, statePopulation, districts);
    	this.districtName = districtName;
        this.municipalCommission = municipalCommission;
        this.districtPopulation = districtPopulation;
        this.districtArea = districtArea;
        this.noOfMP = noOfMP;

    }
    public void getDistrictInfo(){
    	System.out.println("\n--- District Information ---");
        System.out.println("District Name : " + districtName);
        System.out.println("Municipal Commission : " + municipalCommission);
        System.out.println("Area : " + districtArea + " sq km");
        System.out.println("Population : " + districtPopulation);
        System.out.println("Number of MPs : " + noOfMP);

    }
}
class Taluka extends District{
	private String talukaName;
    private long talukaPopulation;
    private String mlaName;


    Taluka(String name, String capital, String language, String primeMinister,double area, long population, char currency,
            String stateName, String stateCapital, String stateLanguage, String stateCM, double stateArea, long statePopulation, int districts,
            String districtName, String municipalCommission, long districtPopulation,double districtArea, int noOfMP,
            String talukaName, long talukaPopulation, String mlaName){

    	super(name, capital, language, primeMinister, area, population, currency,
    		stateName, stateCapital, stateLanguage, stateCM,stateArea, statePopulation, districts,
    	    districtName, municipalCommission, districtPopulation, districtArea, noOfMP);

    	this.talukaName = talukaName;
        this.talukaPopulation = talukaPopulation;
        this.mlaName = mlaName;

    }
     public void getTalukaInfo() {
        System.out.println("\n--- Taluka Information ---");
        System.out.println("Taluka Name : " + talukaName);
        System.out.println("Population : " + talukaPopulation);
        System.out.println("MLA : " + mlaName);
    }
}
class Village extends Taluka{
	private String villageName;
    private String sarpanchName;
    private long villagePopulation;

    Village(String name, String capital, String language, String primeMinister,double area, long population, char currency,
            String stateName, String stateCapital, String stateLanguage, String stateCM, double stateArea, long statePopulation, int districts,
            String districtName, String municipalCommission, long districtPopulation,double districtArea, int noOfMP,
            String talukaName, long talukaPopulation, String mlaName,
            String villageName, String sarpanchName, long villagePopulation){

    	super(name, capital, language, primeMinister, area, population, currency,
    		stateName, stateCapital, stateLanguage, stateCM,stateArea, statePopulation, districts,
    	    districtName, municipalCommission, districtPopulation, districtArea, noOfMP,
    	    talukaName,talukaPopulation,mlaName);

    	this.villageName = villageName;
        this.sarpanchName = sarpanchName;
        this.villagePopulation = villagePopulation;

    }
    public void getVillageInfo(){
    	System.out.println("\n--- Village Information ---");
        System.out.println("Village Name : " + villageName);
        System.out.println("Sarpanch : " + sarpanchName);
        System.out.println("Population : " + villagePopulation);
    }

}
class Multilevel1{
	public static void main(String[] args) {

		Village obj=new Village( "India", "New Delhi", "Hindi", "Narendra Modi", 3287000, 1400000000L, '₹',
            "Maharashtra", "Mumbai", "Marathi", "Devendra Fadanvis", 307713, 125000000L, 36,
            "Pune", "Naval Kishore Ram", 9429400L, 15643, 4,
            "Daund", 380000, "Rahul Kul",
            "Kangaon", "Sampat Phadke", 10000);
		obj.getCountryInfo();
		obj.getStateInfo();
		obj.getDistrictInfo();
		obj.getTalukaInfo();
		obj.getVillageInfo();
		
	}
}