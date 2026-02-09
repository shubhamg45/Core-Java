import java.util.Scanner;
import java.util.Arrays;
class AtoZStroring{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

    	char[]arr=new char[26];

    	for (char ch='A';ch<='Z';ch++) {
    		arr[ch-65]=ch;
    	}
    	System.out.println(Arrays.toString(arr));
    }
}