package String_Problems;
//1221. Split a String in Balanced Strings
//https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
public class BalancedStringSplit {

	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));

	}
	
	 public static int balancedStringSplit(String s) {
	        int c=0,ans=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='R')
	                ans++;
	            else if(s.charAt(i)=='L')
	                ans--;
	            if(ans==0)
	                c++;
	        }
	        return c;
	        
	    }

}
