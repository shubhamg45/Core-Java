abstract class InstantGram1 implements InstantGram{
	String email;
	String pass;
	String userName;
	boolean login;

	int attemptcnt;

	private InstantGram1(){

	}
	public InstantGram1(String email,String pass,String userName){
		super();
		this.email=email;
		this.pass=pass;
		this.userName=userName;

		System.out.println("Account Created Successfully");
	}
	@Override
	public void login(String userName ,String pass){
		if(attemptcnt<attempts){
			if (this.userName==userName && this.pass==pass) {

				login=true;

				System.out.println("Login Successfully ! ");	
			}
			else{
				attemptcnt++;
				System.out.println("Invalid Credentials ");
			}
		}
		else{
			System.out.println("Account Blocked !");
		}
	}
	@Override
	public void logOut(){
		login=false;
		System.out.println("Log-out Successfully");
	}
	@Override
	public void post(String msg){
		if(login){
			System.out.println(msg);
			System.out.println("posted \n");
		}
		else{
			System.out.println("please Login ");
		}
	}

	@Override
	public void comment(String name, String com){
		if (login) {
			System.out.println(com);
			System.out.println(name+" commented");
		}
		else{
		System.out.println("please Login !");
	   }
	}

	@Override

	public void like(){
		System.out.println("liked");

	}
}