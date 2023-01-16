package ArrayProblems;

//1662. Check If Two String Arrays are Equivalent
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/


//optimal solution can be arrived using 2 pointer approach
public class ArrayStringEquivalentCheck {

	public static void main(String[] args) {
		String[] word1 = {"ab", "c"}, word2 = {"a", "cb"};
		System.out.println(arrayStringsAreEqual(word1, word2));

	}
	
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        String s1="";
	        for (int i = 0; i < word1.length; i++) {
				for (int j = 0; j < word1[i].length(); j++) {
					s1+=word1[i].charAt(j);
				}
			}
	        
	        String s2="";
	        for (int k = 0; k < word2.length; k++) {
				for (int k2 = 0; k2 < word2[k].length(); k2++) {
					s2+=word2[k].charAt(k2);
				}
			}
	        return s1.equals(s2);
	        
//	        StringBuilder word1Combined = new StringBuilder();
//	        for (String s : word1) {
//	            word1Combined.append(s);
//	        }
//	        // Creates a new string by combining all the strings in word2.
//	        StringBuilder word2Combined = new StringBuilder();
//	        for (String s : word2) {
//	            word2Combined.append(s);
//	        }
//	        // Returns true if both string are the same.
//	        return word1Combined.compareTo(word2Combined) == 0;
	        
	    }

}
