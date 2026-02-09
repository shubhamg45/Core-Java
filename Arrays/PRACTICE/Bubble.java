import java.util.Arrays;
class Bubble{
	public static void main(String[] args) {
		int [] arr={2,4,1,5,8,3};
		System.out.println(Arrays.toString(arr));

		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i]>=arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}