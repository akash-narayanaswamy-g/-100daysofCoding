package BitManipulation;

//137. Single Number II
//https://leetcode.com/problems/single-number-ii/

import java.util.*;

public class SingleNumber2 {

	public static void main(String[] args) {
		int[] a= {2,2,3,2};
		System.out.println(singleNumber(a));
	}
	 public static int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        if(nums.length > 1)
	            if(nums[0] != nums[1]) return nums[0];
	        for(int i = 1; i < nums.length - 1; i++){
	            if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
	                return nums[i];
	        }
	        return nums[nums.length - 1];
	    }

}
