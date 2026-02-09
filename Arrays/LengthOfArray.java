// here we are iterate the arrys by usind for each loop and also print the length of an array
class LengthOfArray{
	public static void main(String[] args) {
		int []arr={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Arrays Element : ");

		for (int i: arr ) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("length of Array : "+arr.length);
	}
}