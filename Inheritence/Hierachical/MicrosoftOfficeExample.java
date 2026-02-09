class MicrosoftOffice{
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String liscenseDate;
	private String email;
	private String fileType;

	MicrosoftOffice(String firstName,String lastName,String userName,
		String password,String liscenseDate,String email,String fileType){
		this.firstName=firstName;
		this.lastName=lastName;
		this.userName=userName;
		this.password=password;
		this.liscenseDate=liscenseDate;
		this.email=email;
		this.fileType=fileType;
	}
	public void getMicosoftOfficeInfo(){
		System.out.println("\n MicosoftOffice Details ");
		System.out.println("Name : "+firstName+""+lastName);
		System.out.println("userName : "+userName);
		System.out.println("password : "+password);
		System.out.println("liscenseDate : "+liscenseDate);
		System.out.println("email : "+email);
		System.out.println("fileType : "+fileType);
	}
}
class Word extends MicrosoftOffice{
	private int pages;
	private String fontStyle;
    private boolean spellCheckEnabled;

	Word(String firstName,String lastName,String userName,
		String password,String liscenseDate,String email,String fileType,
	      int pages, String fontStyle, boolean spellCheckEnabled){
		super(firstName, lastName, userName, password, liscenseDate, email, fileType);
		this.pages = pages;
        this.fontStyle = fontStyle;
        this.spellCheckEnabled = spellCheckEnabled;
	}
	public void getWordInfo(){
		System.out.println("\n--- Word Details ---");
        // getMicrosoftOfficeInfo();
        System.out.println("Pages: " + pages);
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Spell Check Enabled: " + spellCheckEnabled);

	}

}
class Excel extends MicrosoftOffice{
	private int sheets;
    private int totalRows;
    private boolean formulaEnabled;

	Excel(String firstName,String lastName,String userName,
		String password,String liscenseDate,String email,String fileType,
	     int sheets,int totalRows,boolean formulaEnabled){
		super(firstName, lastName, userName, password, liscenseDate, email, fileType);
		this.sheets=sheets;
		this.totalRows=totalRows;
		this.formulaEnabled=formulaEnabled;

	}
	public void getExcelinfo(){
		System.out.println("\n--- Excel Details ---");
        // getMicrosoftOfficeInfo();
        System.out.println("Sheets: " + sheets);
        System.out.println("Total Rows: " + totalRows);
        System.out.println("Formula Enabled: " + formulaEnabled);

	}
} 
class PowerPoint extends MicrosoftOffice{
	private int slides;
    private boolean animationsEnabled;
    private String theme;

	PowerPoint(String firstName,String lastName,String userName,
		String password,String liscenseDate,String email,String fileType,
	       int slides,boolean animationsEnabled,String theme){
		super(firstName, lastName, userName, password, liscenseDate, email, fileType);
		this.slides=slides;
		this.animationsEnabled=animationsEnabled;
		this.theme=theme;

	}
	public void getPowerPointInfo(){
		System.out.println("\n--- PowerPoint Details ---");
        // getMicrosoftOfficeInfo();
        System.out.println("Slides: " + slides);
        System.out.println("Animations Enabled: " + animationsEnabled);
        System.out.println("Theme: " + theme);

	}
}
class MicrosoftOfficeExample{
	public static void main(String[] args) {

		Word obj=new Word("Shubham", "Gawali", "shubham2144", "pass123", "2025-10-09",
                          "shubham@gmail.com", ".docx", 25, "Times New Roman", true);

		obj.getMicosoftOfficeInfo();
		obj.getWordInfo();

		Excel obj2=new Excel("Shubham", "Gawali", "shubham2144", "pass123", "2025-10-09",
                            "shubham@gmail.com", ".xlsx", 5, 1000, true);

		obj2.getMicosoftOfficeInfo();
		obj2.getExcelinfo();

		PowerPoint obj3=new PowerPoint("Shubham", "Gawali", "shubham2144", "pass123", "2025-10-09",
                                      "shubham@gmail.com", ".pptx", 15, true, "Dark Mode");
		obj3.getMicosoftOfficeInfo();
		obj3.getPowerPointInfo();
		
	}
}