class Calculate{
	public static int solve(int op1, int op2,char opr)
	{
		int result = switch(opr){
		     case '+'->op1+op2;
		     case '-'->op1-op2;
		     case '*'->op1*op2;
		     case '/'->op1/op2;
		     case '%'->op1%op2;
		     default->{
		     	System.out.println("Invalid Operator ");
		     	yield -1;
		     }
		};
		return result;
	}
}