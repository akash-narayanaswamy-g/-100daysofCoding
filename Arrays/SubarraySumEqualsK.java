package ArrayProblems;

import java.util.*;

//560. Subarray Sum Equals K
//https://leetcode.com/problems/subarray-sum-equals-k/description/

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		int[] arr= {1};
		int k=1;
		System.out.println(subarraySum(arr, k));

	}
	
	public static int subarraySum(int[] nums, int k) {
		
		int c=0,sum=0;
		Map<Integer,Integer> m=new HashMap<>();
		m.put(0,1);
        for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			if(m.containsKey(sum-k))
				c+=m.getOrDefault(sum-k, 1);
			m.put(sum, m.getOrDefault(sum, 0)+1);			
		}
        return c;
    }

}

//refer-https://youtu.be/-WhxXnZ5DAA