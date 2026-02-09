import java.util.Scanner;
import java.util.Arrays;
class Store20to60RandomandUnique{
	public static void main(String[] args) {
		int []arr=new int[40];
		//System.out.println(Arrays.toString(arr));
		for(int i=1,cnt=0;;i++){
			int num=(int)(Math.random()*100);
			if(num>=20 && num<=60){

				if(!(checkNumber(arr,num)))
					arr[cnt++]=num;
			}

			if (cnt==40) break;
		}
		System.out.println(Arrays.toString(arr)); // unique and random 20 to 60 Store in array

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static boolean checkNumber(int []arr,int num){
		for (int ele : arr) 
			if (ele==num) return true;

			return false;
	}
}