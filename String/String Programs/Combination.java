class Combination{
	public static void main(String[] args) {
		
		String str= "abc";
		combination1(str);
		 permute(str, "");;
	}
	public static void combination1(String str){
		for (int i=0;i<str.length() ;i++ ) {
			System.out.println(str.charAt(i));
			String str1=str.charAt(i)+"";

			for(int j=0;j<str.length();j++){
				if(i==j)continue;

				str1+=str.charAt(j);
				System.out.println(str1);
			}
			str1="";
			
		}
	}
	public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            permute(left + right, ans + ch);
        }
    }
}