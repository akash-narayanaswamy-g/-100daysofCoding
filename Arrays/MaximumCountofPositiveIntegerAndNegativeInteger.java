package ArrayProblems;

//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
//2529. Maximum Count of Positive Integer and Negative Integer
public class MaximumCountofPositiveIntegerAndNegativeInteger {

	public static void main(String[] args) {
		int[] nums = {-2,-1,-1,1,2,3};
		System.out.println(maximumCount(nums));

	}
	
	 public static int maximumCount(int[] nums) {
	        int p=0,n=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<0)n++;
	            if(nums[i]>0)p++;
	        }
	        return Math.max(n,p);
	    }

}
