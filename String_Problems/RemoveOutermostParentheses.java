package String_Problems;

//1021. Remove Outermost Parentheses
//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));

	}
	
	public static String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int opened=0;
        for(char i:s.toCharArray()) {
        	if(i=='(' && opened++>0)ans.append('(');
        	if(i==')' && opened-->1)ans.append(')');
        }
        
        return ans.toString();
    }

}
