class Q14
{
	public static void main(String[] args) {
		
		int x = 8 ,y= 5;
        //      8(9)* 4(4)+ 4(5)*9(8)    
		int z = x++ * --y + y++ * x--;
		System.out.println(x); //8
		System.out.println(y);   // 5
		System.out.println(z);  //8*4=32 + 36=68
	}
}