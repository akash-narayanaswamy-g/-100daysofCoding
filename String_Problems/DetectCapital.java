package String_Problems;
//520. Detect Capital
//https://leetcode.com/problems/detect-capital/description/

public class DetectCapital {

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
	}
	
	public static boolean detectCapitalUse(String word) {
		int count = 0;
        boolean firstLetter = false;

        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') firstLetter = true;

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') count++;
        }

        if((count == 1 && firstLetter) || count == word.length() || count == 0) return true;
        else return false; 
    }

}
