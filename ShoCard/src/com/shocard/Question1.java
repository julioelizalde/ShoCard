package com.shocard;

import java.util.Stack;


/**
 * 
 * @author Julio Elizalde
 *
 */
public class Question1 {

	/**
	 * Return true if the parentheses "()", brackets "[]", and braces "{}" in
	 * expr are balanced.
	 * 
	 * Examples of balanced:
	 * 
	 * "", "1+2[]", "(1+2)"
	 * 
	 * Examples of not balanced:
	 * 
	 * "(1+2 * [3 - 4)]", "}1-2{"
	 */
	public static boolean isBalanced(String expr) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			switch (c) {
			case '[':
				stack.push(c);

				break;
			case '{':
				stack.push(c);

				break;
			case '(':
				stack.push(c);

				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}

				break;
			case '}':
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}

				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}

			default:
				break;
			}

		}

		return stack.isEmpty();

	}

	
	public static void main(String[] args) {
		String s = "(1+2 * [3 - 4)]";
		if(Question1.isBalanced(s)){
			System.out.println(s + "is balanced");
		}else{
			System.out.println(s + "is not balanced");
		}
		
	}
	
}
