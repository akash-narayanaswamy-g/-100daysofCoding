package String_Problems;

import java.util.*;

//20. Valid Parentheses
public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));

	}
	
	public static boolean isValid(String s) {
        Stack<Integer> st=new Stack<>();
        for (int n : s.toCharArray()) {
        	switch (n) {
			case '(':
			case '[':
			case '{':
				st.push(n);
				break;
			case ')':
				if(st.isEmpty() || st.pop()!='(') 
					return false;
				break;
			
			case '}':
				if(st.isEmpty() || st.pop()!='{') 
					return false;
				break;
			
			case ']':
				if(st.isEmpty() || st.pop()!='[') 
					return false;
				break;
			default:
				break;
			}
		}
        return st.isEmpty();
    }

}
