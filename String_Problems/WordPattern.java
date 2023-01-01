package String_Problems;
import java.util.*;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));

	}
	static boolean wordPattern(String pattern, String s) {
		 String[] words = s.split(" ");
	        if (words.length != pattern.length()) {
	            return false;
	        }

	        Map<Character, String> charToWord = new HashMap<>();
	        Map<String, Character> wordToChar = new HashMap<>();

	        for (int i = 0; i < pattern.length(); i++) {
	            char c = pattern.charAt(i);
	            String word = words[i];

	            if (!charToWord.containsKey(c)) {
	                charToWord.put(c, word);
	            }

	            if (!wordToChar.containsKey(word)) {
	                wordToChar.put(word, c);
	            }

	            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
	                return false;
	            }
	        }

	        return true;  
    }

}
