class Binarysearch{
	public static void main(String[] args) {
		
		int []ar={1, 2, 3, 4, 5, 6, 7, 8, 9};

		int search=10;
		int start=0;
		int end=ar.length-1;
		int mid=(start+end)/2;

		while(start<=end)
		{
			if (ar[mid]==search) {
				System.out.println("ele found at "+mid+" index");
				break;
			}
			else if (search<ar[mid]) 
			{
				end=mid-1;
			}
			else if (search>ar[mid]) {
				start=mid+1;
			}
			mid=(start+end)/2;
		}
			if (search!=mid) 
			{
			System.out.println("not found");
			}
	}
}