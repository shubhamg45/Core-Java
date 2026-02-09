class InstantGramDriver{

	public static void main(String[] args) {

		InstantGram i1=new InstantGram2("raju@gmail.com","raju@123","raju_official");
		i1.login("raju_official","raju@123");

		i1.post("I am feeling so happy");

		i1.comment("Angle priya ","how? ");
		i1.comment("raju_official","For you ");
		i1.chat("Angle priya","Heyy! are you busy? ");
		i1.chat("Angle priya","jevlis ka ");
		i1.chat("Angle priya","are you Alive?  ");

		i1.story("I am lone Wolf? ");
		i1.comment("Simply_Sakshi","why?");

		InstantGram.message("Raju");

		InstantGram i2=new InstantGram2("raju@gmail.com","raju@123","raju_official");

		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());




		
	}
}