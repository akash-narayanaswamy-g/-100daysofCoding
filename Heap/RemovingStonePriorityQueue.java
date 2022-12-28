package Heap;
import java.util.*;

//1962. Remove Stones to Minimize the Total
// https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/

/*
 priority Queue--default min heap
 add()-to add element
 Offer()
 peek()-it just returns the root element and does not removes it .
 remove()-it just removes root and not returns the value
 poll()-it both returns the root element and does removes it .
 */

public class RemovingStonePriorityQueue {

	public static void main(String[] args) {
		
	}
	
	public int minStoneSum(int[] piles, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((first,second)->second - first);//to convert into maxheap
		for (Integer n : piles) {
		pq.add(n);
		}
		while(k>0) {
			int ans=pq.poll();
			pq.add(ans-ans/2);
			k--;			
		}
		int sum=0;
		while(!pq.isEmpty())sum+=pq.poll();
		return sum;
    }

}
