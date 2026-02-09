interface Father{
	public static final double per=75.0;
	public abstract void getDegree();
	public abstract void getPercent();
	public abstract void getJob();

}
interface Mother{
	public static final double per=55.0;
	public abstract void getDegree();
	public abstract void getPercent();
	public abstract void getJob();

}
class Son implements Father,Mother{
	public void getDegree(){
		System.out.println("BCA");
	}
	public void getPercent(){
		System.out.println(87.0);
	}
	public void getJob(){
		System.out.println("Cognizant");
	}


} 
class AcheiveMultipleInheritence{
	public static void main(String[] args) {
		Father obj =new Son();
		obj.getDegree();
		obj.getPercent();
		obj.getJob();
		System.out.println(Father.per);
	}
}