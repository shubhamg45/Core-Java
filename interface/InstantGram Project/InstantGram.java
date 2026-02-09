public interface InstantGram{

	int attempts=3;

	void login(String userName, String Pass);

	void logOut();

	void post(String msg);

	void like();

	void comment(String name, String com);

	void story(String txt);

	void chat(String name, String msg);

	static void message(String name){
		System.out.println("hey! "+name+" ,welcome to InstantGram ");
	}
}