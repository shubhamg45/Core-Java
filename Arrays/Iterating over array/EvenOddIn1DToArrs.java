import java.util.Arrays;
class EvenOddIn1DToArrs{
	public static void main(String[] args) {
		
		int []arr={1,2,3,4,5,6,7,8,9,10};

		int ec=0,oc=0;

		for (int ele : arr) {
			if (ele%2==0) ec++;
			else oc++;
		}
		int []even=new int [ec];
		int []odd=new int [oc];
         

        int ei=0,oi=0;
		for (int ele : arr) {
			if (ele%2==0) even[ei++]=ele;
			else  odd[oi++]=ele;
		}
		System.out.println("EVEN : "+Arrays.toString(even));
		System.out.println("ODD : "+Arrays.toString(odd));

	}
}