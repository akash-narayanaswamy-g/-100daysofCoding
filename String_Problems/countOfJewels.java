package String_Problems;

//771. Jewels and Stones
//https://leetcode.com/problems/jewels-and-stones/description/

import java.util.*;

public class countOfJewels {

	public static void main(String[] args) {
		String jewels = "aA", stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));
	}
	
	public static int numJewelsInStones(String jewels, String stones) {
	   int c=0;
	   Set s=new HashSet();
	   for (char n : jewels.toCharArray()) s.add(n);
	   for (char sto : stones.toCharArray()) if(s.contains(sto))c++;
	   return c;
	    }

}
