package Sliding_Window;

import java.util.*;

//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));

	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int ans=0;
	        int i=0;
	        Map<Character,Integer> m=new HashMap<>();
	        for(int j=0;j<s.length();j++){
	            if(m.containsKey(s.charAt(j)))
	            	i=Math.max(m.get(s.charAt(j)), i);
	            ans=Math.max(ans, j-i+1);
	            m.put(s.charAt(j), j+1);
	        }
	        return ans;

	    }

}
