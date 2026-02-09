class SwitchEx3
{
	public static void main(String[] args) 
	{
		byte a = 127;
		switch (a+1) 
		{
			case 1 : System.out.println("case 1");break;
			case 127 : System.out.println("case 2");break;
			case 128 : System.out.println("case 3");break;
			default : System.out.println("default");break;
		}
	}
}