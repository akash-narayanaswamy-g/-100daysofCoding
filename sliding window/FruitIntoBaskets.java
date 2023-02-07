package Sliding_Window;
import java.util.*;

//904. Fruit Into Baskets
//https://leetcode.com/problems/fruit-into-baskets/description/

public class FruitIntoBaskets {

	public static void main(String[] args) {
		int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(totalFruit(fruits));

	}
	public static int totalFruit(int[] fruits) {
		int max=0;
		Map<Integer,Integer> m=new HashMap<>();
		int start=0;
		
		for (int i = 0; i < fruits.length; i++) {
			m.put(fruits[i], m.getOrDefault(fruits[i], 0)+1);
			
			while(m.size()>2) {
				m.put(fruits[start], m.getOrDefault(fruits[start], 0)-1);
				if(m.get(fruits[start])==0)m.remove(fruits[start]);
				start++;				
			}
			max=Math.max(max,i-start+1);
		}
		return max;
	}

}
