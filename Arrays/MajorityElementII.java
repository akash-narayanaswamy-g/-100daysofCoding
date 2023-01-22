package ArrayProblems;

//229. Majority Element II
//https://leetcode.com/problems/majority-element-ii/description/

import java.util.*;
public class MajorityElementII {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));

	}
	
	public static List<Integer> majorityElement(int[] nums) {
		Map<Integer,Integer> m=new HashMap<>();
        List<Integer> ans=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
			if(m.containsKey(nums[i])) 
				m.put(nums[i], m.get(nums[i])+1);
			else
				m.put(nums[i], 1);
		}
        int n=nums.length;

         for (Map.Entry<Integer,Integer> entry : m.entrySet())  
            if(entry.getValue()>n/3)
                ans.add( entry.getKey()); 
        return ans;
    }

}
