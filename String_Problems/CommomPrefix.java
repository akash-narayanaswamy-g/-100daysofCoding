package String_Problems;

import java.util.Arrays;

//14. Longest Common Prefix
//https://leetcode.com/problems/longest-common-prefix/description/

public class CommomPrefix {

	public static void main(String[] args) {
		String[] strs={"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));

	}
	
	 public static String longestCommonPrefix(String[] strs) {
		 	StringBuilder ans=new StringBuilder();
	        Arrays.sort(strs);
	        char[] s=strs[0].toCharArray();
	        char[] e=strs[strs.length-1].toCharArray();
	        
	        for (int i = 0; i < s.length; i++) {
	            if(s[i]!=e[i])
	                break;
	            ans.append(s[i]);
	            
	        }
	        if(!ans.isEmpty())return ans.toString();
	        return "-1";
	    }

}
