package ArrayProblems;

import java.util.*;

//2367. Number of Arithmetic Triplets
//https://leetcode.com/problems/number-of-arithmetic-triplets/
public class NumberOfArithmeticTriplets {

	public static void main(String[] args) {
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;
		System.out.println(arithmeticTriplets(nums, diff));

	}
	
	public static int arithmeticTriplets(int[] nums, int diff) {
//		int c=0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				for (int k = j+1; k < nums.length; k++) {
//					if(i < j && j < k) {
//					if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
//						c++;
//					}
//					}
//				}
//			}
//		}
//		return c;
		
		 Set<Integer> set = new HashSet<>();
	        
	        for( int num : nums){
	            set.add(num);
	        }
	       
	        int ans = 0;
	            for( int num : nums){
	                if(( set.contains(num + diff ) && set.contains(num + 2 * diff) ) ){
	                    ans++;
	                    
	                }
	            }
	        
	        return ans;
        
    }	
	

}
