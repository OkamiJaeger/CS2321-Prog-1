package cs2321;

public class PostfixExpression {
	
	/**
	 * Evaluate a postfix expression. 
	 * Postfix expression notation has operands first, following by the operations.
	 * For example:
	 *    13 5 *           is same as 13 * 5 
	 *    4 20 5 + * 6 -   is same as 4 * (20 + 5) - 6  
	 *    
	 * In this homework, expression in the argument only contains
	 *     integer, +, -, *, / and a space between every number and operation. 
	 * You may assume the result will be integer as well. 
	 * 
	 * @param exp The postfix expression. You may assume the expression is valid. 
	 * @return the result of the expression. 
	 */
	public static int evaluate(String exp) {
		//TODO: implement this function with the help of Stack
		
				/* IMPOTANT NOTE:  
				 * Since the argument exp is a string, you need to parse the string expression first to get  
				 * operands and operators first. Because we knew there is a space between the operands and operators,
				 * you can use the function string.split(" ") to return an array of tokens in exp. 
				 */
		
		LinkedListStack<Integer> stack = new LinkedListStack<>();
		String[] tokens = exp.split(" ");
		
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			
			if (token.equals("+")) {
			    int num2 = stack.pop();
			    int num1 = stack.pop();
			    stack.push(num1 + num2);
			} 
			else if (token.equals("-")) {
			    int num2 = stack.pop();
			    int num1 = stack.pop();
			    stack.push(num1 - num2);
			}
			else if (token.equals("*")) {
			    int num2 = stack.pop();
			    int num1 = stack.pop();
			    stack.push(num1 * num2);
			}
			else if (token.equals("/")) {
			    int num2 = stack.pop();
			    int num1 = stack.pop();
			    stack.push(num1 / num2);
			}
			else {
			    stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
