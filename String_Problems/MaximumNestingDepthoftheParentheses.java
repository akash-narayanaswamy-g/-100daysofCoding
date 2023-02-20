package String_Problems;

//1614. Maximum Nesting Depth of the Parentheses
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

public class MaximumNestingDepthoftheParentheses {

	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));

	}
	public static int maxDepth(String s) {
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                c++;
            else if(s.charAt(i)==')')
                max=Math.max(max,c--);
        }
        return max;
    }

}
