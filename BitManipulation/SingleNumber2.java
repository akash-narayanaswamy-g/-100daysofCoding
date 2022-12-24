package BitManipulation;

//137. Single Number II
//https://leetcode.com/problems/single-number-ii/

import java.util.*;

public class SingleNumber2 {

	public static void main(String[] args) 
	{
		int[] a= {2,2,3,3,4,3,2};
		System.out.println(singleNumber(a));
		System.out.println(singleNumber2_(a));
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
	 

	 public static int singleNumber2_(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return -1;
	        }
			
			int result = 0;
			int[] bits = new int[32];
			
			for(int i=0; i<32; i++){
				for(int j=0; j<nums.length; j++){
					bits[i] += nums[j] >> i & 1;
					bits[i] %= 3;
				}
				
				result |= (bits[i] << i);
				
			}
			
			return result;
	    }

}
