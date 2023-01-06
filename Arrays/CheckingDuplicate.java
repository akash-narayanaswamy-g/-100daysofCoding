package ArrayProblems;

import java.util.*;

//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/description/?envType=study-plan&id=data-structure-i

public class CheckingDuplicate {

	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		System.out.println(containsDuplicate(nums));
 
	}
	
	public static boolean containsDuplicate(int[] nums) {
        HashSet h=new HashSet();
        for (int i = 0; i < nums.length; i++) {
			if(h.contains(nums[i]))
				return true;
			h.add(nums[i]);
		}
        return false;
        
    }

}
