import java.util.Scanner;
import java.util.Arrays;
class StoreAtoZRandomandUnique{
	public static void main(String[] args) {
		char []arr=new char[26];

		//System.out.println(Arrays.toString(arr));
		for(int i=1,cnt=0;;i++){
			
			char ch=(char)(Math.random()*100);
			if(ch>=65 && ch<=90){

				if(!(checkCharacter(arr,ch)))
					arr[cnt++]=ch;
			}

			if (cnt==26) break;
		}
		System.out.println(Arrays.toString(arr)); // unique and random ABCD Store in array
		// Arrays.sort(arr); // we can see by sorting ele is dup or not 
	    // System.out.println(Arrays.toString(arr));
	}
	public static boolean checkCharacter(char []arr,char ch){
		for (char ele : arr) 
			if (ele==ch) return true;

			return false;
	}
}