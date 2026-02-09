import java.util.Arrays;
class Selection{
	public static void main(String[] args) {
		int [] arr={8,3,7,9,2,0,6,4,5,1};
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length-1 ;i++ ) 
		{
			int min=i;
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				if(arr[min]>=arr[j])  min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}