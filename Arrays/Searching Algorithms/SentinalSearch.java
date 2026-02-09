import java.util.Arrays;
class SentinalSearch{
	public static void main(String[] args) {
		int[]arr=new int[20];

		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		int key=20;

		int pos=sentinalSearch(arr,arr.length,key);
		System.out.println("OutPut  "+key+" : "+pos);
	}
	public static int sentinalSearch(int []arr,int n, int key)
	{
		int last=arr[n-1];   //last ele stored
		arr[n-1]=key;   //sentinal placed

		int i=0;
		while(arr[i]!=key) i++;

		arr[n-1]=last;    //sentinal replace with last 

		if (i<n-1 || last ==key) return i;
		else return -1;
	}
}