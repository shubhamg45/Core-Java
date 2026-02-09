import java.util.Arrays;
class LinearSearch{
	public static void main(String[] args) {
		
		int []ar={9,1,1,4,5,2,3,7,8};
		int search=8;
        int i;
		for (i=0;i<ar.length;i++ ) 
		{
           
           if (ar[i]==search) 
           {
           	System.out.println("element found at "+i+" index");
            break;
           }
		}
		if (i!=search) {
			System.out.println("ele not found");
		}
	}
}