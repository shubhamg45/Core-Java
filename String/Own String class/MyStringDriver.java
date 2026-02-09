import java.util.*;
class MyStringIndexOutOfBoundsException extends RuntimeException{
	MyStringIndexOutOfBoundsException(String massage){
		super(massage);
	}
}
final class MyString{
	char []arr;
	public MyString(){
		arr=new char[0];
	}
	public MyString(String str){
		arr=new char[str.length()];
		for (int i=0;i<str.length() ;i++ ) {
			arr[i]=str.charAt(i);
		}
	}
	public MyString(StringBuffer sb){
		this(sb.toString());
	}
	public MyString(StringBuilder sb){
		this(sb.toString());
	}
	public MyString(char []arr){
		this.arr=arr.clone();
	}
	public MyString(char[]arr,int start,int count){
		if((start+count)>arr.length) throw new MyStringIndexOutOfBoundsException("Invalid ["+start+" ,"+start+"+"+count+"] out of bound for length"+arr.length);
		this.arr=new char[count];
		for(int i=start,j=0;i<(start+count);i++,j++){
			this.arr[j]=arr[i];
		}
	}
	@Override
	public String toString(){
		String str="";
		for (char ele :arr ) 
			str+=ele;
			return str;
	}

	public int length(){
		 return arr.length;
	}

	public boolean isEmpty(){
		return arr.length==0;
	}

	public char charAt(int index){
		 if(index < 0 || index >= arr.length){
        throw new MyStringIndexOutOfBoundsException(
            "Index " + index + " out of bounds for length " + arr.length);
    }
    return arr[index];
	}

	public int codePointAt(int index){
		 if(index < 0 || index >= arr.length){
        throw new MyStringIndexOutOfBoundsException(
            "Index " + index + " out of bounds for length " + arr.length);
    }
    return (int) arr[index];
    }

	public int codePointBefore(int index){
		 if(index <= 0 || index > arr.length){
        throw new MyStringIndexOutOfBoundsException(
            "Index " + index + " out of bounds for length " + arr.length);
    }
    return (int) arr[index-1];
   }

   public int codePointCount(int startIndx ,int endIndx){
   	    if(beginIndex < 0 || endIndex > arr.length || beginIndex > endIndex){
        throw new MyStringIndexOutOfBoundsException(
            "Invalid range [" + beginIndex + ", " + endIndex + "] for length " + arr.length);
    }
    return endIndex - beginIndex;
    }
    public int indexOf(int ch){
    	for(int i=0;i<arr.length;i++){
           if(arr[i]==ch) return i;
    	}
    	 return -1;
    }
    public int lastindexOf(int ch){
    	for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==ch) return i;
    	}
    	 return -1;
    }
    public MyString toUpperCase(){

    char[] upper = new char[arr.length];

    for(int i = 0; i < arr.length; i++){
        char ch = arr[i];
        if(ch >= 'a' && ch <= 'z'){
            upper[i] = (char)(ch - 32);
        } else {
            upper[i] = ch;
        }
    }
    return new MyString(upper);
    }
    public MyString toLowerCase(){
    char[] lower = new char[arr.length];

    for(int i = 0; i < arr.length; i++){
        char ch = arr[i];
        if(ch >= 'A' && ch <= 'Z'){
            lower[i] = (char)(ch + 32);
        } else {
            lower[i] = ch;
        }
    }
    return new MyString(lower);
    }
}

class MyStringDriver{
	public static void main(String[] args) {
		MyString a = new MyString("hello");
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(a.charAt(2));
		
	}
}