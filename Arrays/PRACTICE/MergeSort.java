import java.util.Arrays;
class MergeSort{
	public static void main(String[] args) {
		int []arr={5,4,6,3,2,7,1,8,0,9};
		System.out.println("before : "+Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("after : "+Arrays.toString(arr));
	}
	public static void mergeSort(int []arr,int l,int r){
		if(l<r){
			int mid=(l+r)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,l);
			merge(arr,l,mid,l);
		}
	}
	public static void merge(int[] arr,int l,int mid,int r){
		int len1=mid-l+1;
		int len2=r-mid;

		int []left=new int[len1];
		int []right=new int[len2];

		for(int i=0;i<len1;i++){
			left[i]=arr[l+i];
		}
		for(int i=0;i<len2;i++){
			right[i]=arr[mid-l+i];
		}

		int i=0,j=0,k=l;

		while(i<len1 && j<len2){
			if (left[i]<right[j]) {
				arr[k++]=left[i++];
			}
			arr[k++]=right[j++];
		}
		while(i<len1) arr[k++]=left[i++];
		while(j<len2) arr[k++]=right[j++];

	}
}
