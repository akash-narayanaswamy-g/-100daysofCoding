package Collection_framework;

import java.util.*;

//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/description/

public class FindDuplicate {

	public static void main(String[] args) {
		int[] a= {1,3,4,2,2};
		System.out.println(findDuplicate(a));
		

	}
	
	 public static int findDuplicate(int[] nums) {
	        Set<Integer> obj=new HashSet<>();
	        for(int i=0;i<nums.length;i++){
	            if(!obj.add(nums[i]))
	                return nums[i];

	        }
	        return 0;
	    }

}
