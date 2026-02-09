class InstantGram2 extends InstantGram1{

	public InstantGram2(String email,String pass,String userName){
		super(email,pass,userName);
	}
	@Override
	public void chat(String name ,String msg){
		System.out.println(msg);
		System.out.println("message sent to "+name+"\n");

	}
	@Override
	public void story(String txt){
		System.out.println(txt);
		System.out.println(userName+" Uploaded a Story \n");
	}

	public String toString(){
		return userName;
	}
	public boolean equals(Object o){
		if(o!=null){
			if (o instanceof InstantGram2) {
				
				InstantGram2 i=(InstantGram2)o;
				return this.userName==i.userName && this.pass==i.pass
				 && this.email==i.email;
			}

		}
		return false;
	}
	public int hashCode(){
		return userName.hashCode()+email.hashCode()+pass.hashCode();
	}
}