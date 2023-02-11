package String_Problems;

import java.util.*;
import java.util.Map.Entry;
//451. Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));

	}
	static class Pair{
		int count ; char ch;
		Pair(int i , char j){
			count = i;
			ch = j;
		}
	}
	 public static String frequencySort(String s) {
	        HashMap<Character,Integer> m=new HashMap<>();
			
	        for(char i:s.toCharArray()){
	            m.put(i, m.getOrDefault(i, 0)+1);
	        }
	        
	        PriorityQueue<Pair> pq =new PriorityQueue<>((a,b)->b.count-a.count);
	        
	        for (Map.Entry<Character, Integer> entry : m.entrySet())
	        {
	        	pq.add(new Pair(entry.getValue(),entry.getKey()));
	        }
	        String str = "";
	        while(!pq.isEmpty()) {
	        	Pair p = pq.remove();
	        	for(int i=0;i<p.count;i++) {
	        		str+=p.ch;
	        	}
	        }
	        return str;
	    }

}
