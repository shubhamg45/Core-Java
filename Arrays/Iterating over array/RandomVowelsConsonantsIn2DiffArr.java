import java.util.Arrays;
class RandomVowelsConsonantsIn2DiffArr{
	public static void main(String[] args) {
		char []arr=new char[20];

		for(int i=1,cnt=0;;i++){
			
			char ch=(char)(Math.random()*100);
			if(ch>=65 && ch<=90){
					arr[cnt++]=ch;
			}

			if (cnt==20) break;
		}
		   int vcnt=0,ccnt=0;
	      for (char ele : arr) {
	      	if (ele=='A'||ele=='E'||ele=='I'||ele=='O'||ele=='U') {
	      		vcnt++;
	      	}
	      	else ccnt++;
	      	
	      }
	char []vowels=new char[vcnt];
	char []consonant=new char[ccnt];

	int v=0,c=0;
	for (char ele : arr) {
            if (ele=='A'||ele=='E'||ele=='I'||ele=='O'||ele=='U') vowels[v++]=ele;
	      	else consonant[c++]=ele;
	      
	}
	System.out.println("Random array : "+Arrays.toString(arr));

	System.out.println("vowels : "+Arrays.toString(vowels));
	System.out.println("consonant : "+Arrays.toString(consonant));
	Arrays.sort(arr);
	System.out.println("Sorted Array: "+Arrays.toString(arr));


  }
}