package ArrayProblems;

//451. Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/
import java.util.*;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String s = "akash";
		System.out.println(frequencySort(s));

	}
	
	public static String frequencySort(String s) {
		TreeMap<Character,Integer> m=new TreeMap<>();
		TreeMap<Integer,Character> m2=new TreeMap<>(Collections.reverseOrder());
        for(char i:s.toCharArray()){
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        String ans="";
        for(Map.Entry<Character,Integer> j:m.entrySet()) {
            m2.put(j.getValue(), j.getKey());
            System.out.println(m2);
        }
        for(Map.Entry<Integer,Character> k:m2.entrySet()) {
        	for (int i = 0; i < k.getKey(); i++) {
			
            ans+=k.getValue();}
        }
       
        return ans;
    }

}
