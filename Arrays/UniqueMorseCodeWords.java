package ArrayProblems;

//804. Unique Morse Code Words
//https://leetcode.com/problems/unique-morse-code-words/description/

import java.util.*;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		String[] words = {"gin","zen","gig","msg"};
		System.out.println(uniqueMorseRepresentations(words));

	}
	
	public static int uniqueMorseRepresentations(String[] words) {
        if(words.length==1)return 1;
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> present=new HashSet<>();
        for(String s:words){
            StringBuilder count=new StringBuilder();
            for(Character c:s.toCharArray()){
               count.append(morse[c-'a']);
            }
            present.add(count.toString());
        }
        return present.size();
    }

}
