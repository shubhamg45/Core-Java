interface A{
	public abstract void show();
	private static void remove(){
		System.out.println("removed");
	}
    default void add(){
    	System.out.println("added");
    }
    private void sub(){
    	System.out.println("substracted");
    }

}
class B implements A{
	public void show(){
		System.out.println("showed");
	}
	@Override
	public void add(){
		System.out.println("add by B");
	} 

}
class InterfaceExample{

	A obj=new B();
	obj.show();
	obj.add();
	obj.remove();

}