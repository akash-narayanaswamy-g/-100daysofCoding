package ArrayProblems;

import java.util.*;

//1833. Maximum Ice Cream Bars
//https://leetcode.com/problems/maximum-ice-cream-bars/description/

public class MaximumIceCreamBars {

	public static void main(String[] args) {
		int[] costs= {1,3,2,4,1};
		int coins=7;
		System.out.println(maxIceCream(costs, coins));

	}
	
	 public static int maxIceCream(int[] costs, int coins) {
	        int c=0;
	        Arrays.sort(costs);
	        for(int i=0;i<costs.length;i++){
	            coins-=costs[i];
	            if(coins<0)
	                break;
	            c++;
	        }
	        return c;
	        
	    }

}
