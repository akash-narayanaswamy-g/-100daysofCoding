package String_Problems;

//2193. Minimum Number of Moves to Make Palindrome
public class MinimumNumberofMovestoMakePalindrome {

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(minMovesToMakePalindrome(s));
	}
	
	public static int minMovesToMakePalindrome(String s) {
        int count = 0;
        
        while(s.length() > 2) {
            char ch1 = s.charAt(0);
            int len = s.length();
            char ch2 = s.charAt(len - 1);
            
            if (ch1 == ch2) {
                s = s.substring(1, len - 1);
            } else {
                int id1 = s.lastIndexOf(ch1);
                int id2 = s.indexOf(ch2);
                
                int steps1 = len - id1 - 1;
                int steps2 = id2;
                
                StringBuilder sb = new StringBuilder();
                
                if (steps1 > steps2) {
                    count += steps2;
                    sb.append(s.substring(0, id2));
                    sb.append(s.substring(id2 + 1, len - 1));
                } else {
                    count += steps1;
                    sb.append(s.substring(1, id1));
                    sb.append(s.substring(id1 + 1));
                }
                
                s = sb.toString();
            }
        }
        
        return count;
    }

}
