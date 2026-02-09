import java.util.Arrays;
class StringExample{
	public static void main(String[] args) {
		String str = "hippopotammmmus";

		char [] arr= str.toCharArray();
		System.out.println(Arrays.toString(arr));

		frequencyOfCharacters(arr,arr.length);

		String distinct =distinctCharacters(arr,arr.length);
		System.out.println("Distinct : "+distinct);

		String uni =uniqueCharacters(arr,arr.length);
		System.out.println("Unique : "+uni);

		String dup =duplicateCharacters(arr,arr.length);
		System.out.println("Duplicate : "+dup);

	}
	public static void frequencyOfCharacters(char []arr,int n){
		boolean []t=new boolean [n];
		for (int i=0;i<n ;i++ ) {
			if (t[i]) continue;

			int cnt =1;

			for (int j=i+1;j<n ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					t[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
		}

	}
	public static String distinctCharacters(char []arr,int n){
		String str="";
		boolean []t=new boolean [n];
		for (int i=0;i<n ;i++ ) {
			if (t[i]) continue;

			int cnt =1;

			for (int j=i+1;j<n ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					t[j]=true;
				}
			}
			str+=arr[i];
			
		}
		return str;

	}
	public static String uniqueCharacters(char []arr,int n){
		String str="";
		boolean []t=new boolean [n];
		for (int i=0;i<n ;i++ ) {
			if (t[i]) continue;

			int cnt =1;

			for (int j=i+1;j<n ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					t[j]=true;
				}
			}
			if(cnt==1)
			str+=arr[i];	
		}
		return str;
	}
	public static String duplicateCharacters(char []arr,int n){
		String str="";
		boolean []t=new boolean [n];
		for (int i=0;i<n ;i++ ) {
			if (t[i]) continue;

			int cnt =1;

			for (int j=i+1;j<n ;j++ ) {
				if (arr[i]==arr[j]) {
					cnt++;
					t[j]=true;
				}
			}
			if(cnt>1)
			str+=arr[i];	
		}
		return str;
	}
}