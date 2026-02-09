// using for Each Loop

class SumOfEleOfArray{
	public static void main(String[] args) {
		byte [] arr={10,20,30,40,50};
         
         int sum=0;
		for (byte ele :arr ) sum+=ele;
		System.out.println(sum);
	}
}