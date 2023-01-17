package String_Problems;

//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

	public static void main(String[] args) {
		String s= "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
		int l=0,r=s.length()-1;
		while(l<=r) {
			if(!Character.isLetterOrDigit(s.charAt(l)))
				l++;
			else if(!Character.isLetterOrDigit(s.charAt(r)))
				r--;
			else if(Character.toLowerCase(s.charAt(r))!=Character.toLowerCase(s.charAt(l)))
				return false;
			else {
				l++;
				r--;
			}
		}
		return true;
        
    }

}
