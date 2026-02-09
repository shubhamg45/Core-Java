import java.util.Arrays;
class BubbleSortString{
	public static void main(String[] args) {
		
		String [] arr={"ramesh","suresh","mukesh","hitesh","yogesh","rajesh"};

		bubbleSortString(arr,arr.length);
		System.out.println(ArrayS.toString(arr));
	}
	public static void bubbleSortString(String []arr,int n){
		for (int i=0;i<n-1 ;i++) {
			for (int j=i+1;j<n;j++ ) {
				if((arr[i].compareTo(arr[j]))<0){
					String temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
}