class PalindromeOrNot{
	public static void main(String[] args) {
		 int []arr={1,2,3,4,4,3,2,1};   // time complexity is O(n/2);

		 int i=0,j=arr.length-1;
		 while(i<j){
            arr[i]=arr[j];
            arr[j]=arr[i];
             i++;
             j--;
		 }
		 if (i<j) {
		 	System.out.println("Not Palindrome");
		 }
		 else{
		 	System.out.println("Is Palindrome");
		 }
	}
}