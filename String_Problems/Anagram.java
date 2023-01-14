package String_Problems;

//242. Valid Anagram
//https://leetcode.com/problems/valid-anagram/
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s="a",t="ab";
		System.out.println(isAnagram(s, t));

	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())return false;
        int[] alphabet=new int[26];
        for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i)-'a']++;
		}
        for (int i = 0; i < s.length(); i++) {
			alphabet[t.charAt(i)-'a']--;
		}
        for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i]!=0)
				return false;
		}
        return true;
    }

}
