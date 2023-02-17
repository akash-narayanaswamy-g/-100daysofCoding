package ArrayProblems;

//152. Maximum Product Subarray
//https://leetcode.com/problems/maximum-product-subarray/

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] nums = {2,3,-2,4};
		System.out.println(maxProduct(nums));

	}
	
	public static int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i]*min;
            int y=nums[i]*max;

            min=Math.min(nums[i],Math.min(x,y));
            max=Math.max(nums[i],Math.max(x,y));
            res=Math.max(max,res);
        }
        return res;
    }

}
