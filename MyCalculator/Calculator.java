class Calculator{
	public static void main(String[] args) {
		System.out.println(" ***WEL-COME***");
		System.out.print("Enter Operand 1: ");
		int operand1=UserInput.userInput();

		System.out.print("Enter the operand 2: ");
		int operand2=UserInput.userInput();

		System.out.print("Enter an Operator : ");
		char operator = UserInput.userOperator();

		int result =Calculate.solve(operand1,operand2,operator);
		System.out.printf("%d %c %d = %d%n", operand1, operator, operand2, result);
	}
}
