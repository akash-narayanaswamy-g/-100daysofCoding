package ArrayProblems;

//1832. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class Pangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));

	}
	
	public static boolean checkIfPangram(String sentence) {
        int[] c=new int [26];
        for(int i=0;i<sentence.length();i++){
            c[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(c[i]==0)
                return false;
        }
        return true;
    }

}
