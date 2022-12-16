package String_Problems;


//205. Isomorphic Strings
//https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s.length() != t.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i=0; i< s.length(); i++){
            if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i+1;
            m2[t.charAt(i)] = i+1;
        }

        return true;
        
    }
}

public class IsomorphicString {

	public static void main(String[] args) {
		Solution obj=new Solution();
		boolean b=obj.isIsomorphic("egg", "add");
		System.out.println(b);

	}

}
