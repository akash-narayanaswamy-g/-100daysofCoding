package ArrayProblems;

//451. Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/
import java.util.*;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));

	}
	
	public static String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i)))
            	m.put(s.charAt(i),m.get(s.charAt(i))+1);
            m.put(s.charAt(i), 1);
        }
        Collections.sort((Map<>haracter,Integer>) m,(a,b)->m.get(b)-m.get(a));
    }

}
