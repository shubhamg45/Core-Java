class ConnectionDatabase
{
	static String userName;        //null
	static String password;        //null
	static String dbName;          //null
	static String serverName;      //null
	static int  localHost;         //0

	//staticBlock 
	static{
		userName=System.getenv("name");
		password=System.getenv("pw");
		dbName=System.getenv("dname");
		serverName="mySQL";
		localHost=5580;

	}
	public static boolean generateUrl(String user, String pass, String dbname)
	{
		if (user.equals(userName)
			&&pass.equals(password)&&
				dbname.equals(dbName))
		{
			return true;

		}
		return false;
	}
}
class ApplicationExample
{
	static{
		System.out.println("driver loaded");
		System.out.println("Connection established");
		if (ConnectionDatabase.generateUrl("SHUBHAM","gawali","EMP")) 
		{
			System.out.println("DB connection Established");
		}
		else{
			System.out.println("DB connection Failed");
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		launchApplication();
	}
	public static void launchApplication()
	{
		features:
		for (; ; ) 
		{
			System.out.println("HOME PAGE");
			System.out.println("FEATURES");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.REMOVE EMPLOYEE");
			System.out.println("3.SEARCH EMPLOYEE");
			System.out.println("4.LOGOUT");
			int opt= new java.util.Scanner(System.in).nextInt();
			switch (opt) {
			case 1,2,3 ->{
				System.out.println(" IMPLEMENTATION SOON ");
			}
		    case 4 -> {
		    	System.out.println("THANK U ");
		    	break features;
		    }
			 	
			 } ;
		}
	}
}