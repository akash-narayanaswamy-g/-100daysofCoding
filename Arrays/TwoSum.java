package ArrayProblems;

import java.util.*;

//1. Two Sum
//https://leetcode.com/problems/two-sum/

public class TwoSum {

	public static void main(String[] args) {
		int[] nums= {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				ans[1]=i;
				ans[0]=map.get(target-nums[i]);
				//System.out.println(map);
				return ans;
			}
			map.put(nums[i], i);
		}
        //System.out.println(map);
        return ans;
    }

}
